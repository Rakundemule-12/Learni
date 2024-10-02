package org.example.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.example.Pojos.BookingResponse;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;

import org.example.utils.PropertyReader;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class testCreateBookingTCPOST extends BaseTest {

    @Owner("Pavan")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify That post request is working fine")
    @Test
    public void testverifyCreateBookingPOST01()
    {
//        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);

        response = RestAssured.given(requestSpecification).when().body(payloadManager.createPayloadBookingAsString()).post();
        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(Integer.parseInt(PropertyReader.readKey("booking.post.statuscode.success")));

        //three types of assertions can be added

        //1.default one
        validatableResponse.body("booking.firstname", Matchers.equalTo(PropertyReader.readKey("booking.post.firstname")));

        BookingResponse bookingResponse = payloadManager.bookingResponseJava(response.asString());

        //2.AssertJ
        assertThat(bookingResponse.getBookingid()).isNotNull();
        assertThat(bookingResponse.getBooking().getFirstname()).isNotNull().isNotBlank();
        assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo(PropertyReader.readKey("booking.post.firstname"));

        //3.TestNg Assertions
        assertActions.VerifyStatusCode(response,200);




    }


}
