package org.example.modules;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import org.example.Pojos.*;

public class PayloadManager {
  // Converting Java Objects to JSON
    public String createPayloadBookingAsString()
    {
        Booking booking = new Booking();
        booking.setFirstname("James");
        booking.setLastname("Brown");
        booking.setTotalprice(111);
        booking.setDepositpaid(true);


        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-05-01");

        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

//        String baseUrl = "https://restful-booker.herokuapp.com";
//        String basePath= "/booking";



        Gson gson = new Gson();
        String jsonstringpayload = gson.toJson(booking);
        return jsonstringpayload ;
    }

    public String createPayloadBookingasStringFaker()
    {
        Faker faker = new Faker();
        Booking booking = new Booking();
        booking.setFirstname(faker.name().firstName());    //you can also get the data from excel or gson whenver you want to
        booking.setLastname(faker.name().lastName());
        booking.setTotalprice(faker.random().nextInt(1000));
        booking.setDepositpaid(true);


        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-05-01");

        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

//        String baseUrl = "https://restful-booker.herokuapp.com";
//        String basePath= "/booking";



        Gson gson = new Gson();
        String jsonstringpayload = gson.toJson(booking);
        return jsonstringpayload ;
    }

    public BookingResponse bookingResponseJava(String responseString)
    {
        Gson gson = new Gson();

        BookingResponse bookingResponse = gson.fromJson(responseString, BookingResponse.class);
        return bookingResponse;
    }

    public String setAuthPayload()
    {
        Auth auth = new Auth();
        auth.setUsername("admin");
        auth.setPassword("password123");
        Gson gson = new Gson();
        String jsonpayloadString = gson.toJson(auth);
        System.out.println("Payload Set to the" + jsonpayloadString);
        return jsonpayloadString;
    }

    public String getTokenFromJSON(String tokenResponse)
    {
        Gson gson = new Gson();
        TokenResponse tokenResponse1 = gson.fromJson(tokenResponse, TokenResponse.class);
        return tokenResponse1.getToken();
    }

    public Booking getResponseFromJSON(String getResponse)
    {
        Gson gson = new Gson();

        //Desrialization
         Booking booking = gson.fromJson(getResponse,Booking.class);
         return booking;
    }

    public String fullUpdatePayloadAsString()
    {

        Booking booking = new Booking();
        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice(112);
        booking.setDepositpaid(true);


        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2024-02-01");
        bookingdates.setCheckout("2024-05-01");

        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");
        Gson gson = new Gson();
        return gson.toJson(booking);
    }
}
