package org.example.assertions;

import io.restassured.response.Response;

import static org.testng.AssertJUnit.assertEquals;

public class AssertActions {
     public void VerifyResponseBody(String actual, String expected, String Description)
     {
         assertEquals(actual, expected, Description);
     }

    public void VerifyResponseBody(int actual, int expected, int Description)
    {
        assertEquals(actual, expected, Description);
    }

    public void VerifyStatusCode(Response response,int expected)
    {
        assertEquals(response.getStatusCode(), expected);
    }
}
