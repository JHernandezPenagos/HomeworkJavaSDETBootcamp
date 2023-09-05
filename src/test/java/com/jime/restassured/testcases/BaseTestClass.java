package com.jime.restassured.testcases;

import com.jime.restassured.dao.UserGorest;
import com.ti.baseapi.RestAssuredUtilsOld;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BaseTestClass {
    private static final String BASE_URL = "https://gorest.co.in/public/v2/";
    private static final String TOKEN = "4131c9936d259bae9d9d0ea239a4c1ecdb98d22c8b098390f5eb7de3fa8ce892";

    Map<String, String> expectedHeaders = Map.of("Authorization", "Bearer " + TOKEN,
            "Content-Type", "application/json",
            "Accept", "*/*");

    List<UserGorest> userGorests = new ArrayList<>();
    protected Map<String, String> postUserData = Map.of("name", "Jimena Hdez",
            "gender", "female",
            "email", "jimena.hdez@gmail.com",
            "status", "active");

    protected Map<String, String> putUserData = Map.of("name", "Jime Hernandez",
            "email", "jimena@gmail.com",
            "status", "inactive");
    protected ResponseOptions<Response> response;

    @BeforeTest
    public void setup() {
        new RestAssuredUtilsOld(BASE_URL, expectedHeaders);
    }
}
