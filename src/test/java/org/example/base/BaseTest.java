package org.example.base;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.example.Pojos.Booking;
import org.example.assertions.AssertActions;
import org.example.endpoints.APIConstants;
import org.example.modules.PayloadManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
    public RequestSpecification requestSpecification;
    public ValidatableResponse validatableResponse;
    public Response response;
    public AssertActions assertActions;
    public JsonPath jsonPath;
    public PayloadManager payloadManager;

    @BeforeTest
    public void setup()
    {
        payloadManager = new PayloadManager();
        assertActions = new AssertActions();

        //this is a spec builder similar to the 2nd below you can use any of this.
//        requestSpecification = new RequestSpecBuilder()
//        .setBaseUri(APIConstants.BASE_URL).
//        addHeader("Content-Type","application JSON").build().log().all();

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri(APIConstants.BASE_URL);
        requestSpecification.contentType(ContentType.JSON).log().all();

    }

    public String getToken()
    {
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri(APIConstants.BASE_URL);
        requestSpecification.basePath(APIConstants.AUTH_URL);

        //Setting the Payload
        String payload = payloadManager.setAuthPayload();

        //Get the token
        response = requestSpecification.contentType(ContentType.JSON).body(payload).when().post();

        String token = payloadManager.getTokenFromJSON(response.asString());

        return token;
    }

    public Booking getResponseFromJSON(String getResponse)
    {
        Gson gson = new Gson();
        Booking booking = gson.fromJson(getResponse,Booking.class);
        return booking;
    }
}
