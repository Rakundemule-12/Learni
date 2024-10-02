package org.example.tests.integrations;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.example.Pojos.Booking;
import org.example.Pojos.BookingResponse;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.example.listners.RetryAnalyzer;
import org.example.utils.PropertyReader;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@Test(retryAnalyzer = RetryAnalyzer.class)
public class TCIntegrationflowRetry extends BaseTest {
    //Create a Booking, Create a Token
    //Get Booking
    //Update the Booking
    //Delete the Booking

    @Test(groups = "integration", priority = 1)
    @Owner("Pavan")
    @Description("TC#INT1 - Step 1 . Verify that the Booking can be Created" )
    public void testCreateBooking(ITestContext iTestContext)
    {
        iTestContext.setAttribute("token",getToken());

        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);

        response = RestAssured.given(requestSpecification).when().body(payloadManager.createPayloadBookingAsString()).post();
        validatableResponse = response.then().log().all();

        validatableResponse.statusCode(200);


        //three types of assertions can be added

        //1.default one
        //validatableResponse.body("booking.firstname", Matchers.equalTo(PropertyReader.readKey("booking.post.firstname")));

        BookingResponse bookingResponse = payloadManager.bookingResponseJava(response.asString());

        //2.AssertJ
        assertThat(bookingResponse.getBookingid()).isNotNull();
        assertThat(bookingResponse.getBooking().getFirstname()).isNotNull().isNotBlank();
        assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo(PropertyReader.readKey("booking.post.firstname"));


        //Set the booking ID
        iTestContext.setAttribute("bookingid",bookingResponse.getBookingid());

        System.out.println("The Booking has Been Created");
    }

    @Test(groups = "integration", priority = 2)
    @Owner("Pavan")
    @Description("TC#INT1 - Step 2 . Verify the Booking By Id" )
    public void testVerifyBookingID(ITestContext iTestContext)
    {
        //bookingId
        Integer bookingId = (Integer)  iTestContext.getAttribute("bookingid");

        //GET Req
        String basePathGET = APIConstants.CREATE_UPDATE_BOOKING_URL + "/" + bookingId;
        System.out.println(basePathGET);

        requestSpecification.basePath(basePathGET);
        response = RestAssured.given(requestSpecification).when().get();

        validatableResponse = response.then().log().all();

        //Validating Assertions
        validatableResponse.statusCode(200);

        Booking booking = payloadManager.getResponseFromJSON(response.asString());

        assertThat(booking.getFirstname()).isNotNull().isNotBlank();
        assertThat(booking.getFirstname()).isEqualTo(PropertyReader.readKey("booking.get.firstname"));
        System.out.println("The Booking has Been Verified");

    }


    @Test(groups = "integration", priority = 3)
    @Owner("Pavan")
    @Description("TC#INT1 - Step 3 . Verify the Updated Booking by ID" )
    public void testUpdateBookingByID(ITestContext iTestContext)
    {
        System.out.println("Token - " + iTestContext.getAttribute("token"));
        String token = (String) iTestContext.getAttribute("token");
        Integer bookingId = (Integer)  iTestContext.getAttribute("bookingid");

        String basePathPUTPATCH = APIConstants.CREATE_UPDATE_BOOKING_URL + "/" + bookingId;
        System.out.println(basePathPUTPATCH);

        requestSpecification.basePath(basePathPUTPATCH);
        response = RestAssured.given(requestSpecification).cookie("token", token).when()
                .body(payloadManager.fullUpdatePayloadAsString()).put();

        validatableResponse = response.then().log().all();

        //Validating Assertions
        validatableResponse.statusCode(200);

        Booking booking = payloadManager.getResponseFromJSON(response.asString());

        assertThat(booking.getFirstname()).isNotNull().isNotBlank();
        assertThat(booking.getFirstname()).isEqualTo(PropertyReader.readKey("booking.put.firstname"));
        assertThat(booking.getLastname()).isEqualTo(PropertyReader.readKey("booking.put.lastname"));
        System.out.println("The Booking has Been Updated");

    }

    @Test(groups = "integration", priority = 4)
    @Owner("Pavan")
    @Description("TC#INT1 - Step 1 . Delete the Booking by ID" )
    public void testDeleteBookingById(ITestContext iTestContext)
    {
        String token = (String) iTestContext.getAttribute("token");
        Assert.assertTrue(true);
        Integer bookingId = (Integer)  iTestContext.getAttribute("bookingid");

        String basePathDELETE = APIConstants.CREATE_UPDATE_BOOKING_URL + "/" + bookingId;
        System.out.println(basePathDELETE );

        requestSpecification.basePath(basePathDELETE).cookie("token", token);
        validatableResponse = RestAssured.given().spec(requestSpecification).when().delete().
                then().log().all();


        //Validating Assertions
        validatableResponse.statusCode(400);

        System.out.println("The Booking has Been Deleted");




    }
}


