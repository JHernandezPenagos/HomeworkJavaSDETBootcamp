package com.jime.restassured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.Map;

public class RequestSpectExample {
    private static final String BASE_URL = "https://gorest.co.in/public/v2/";
    private static final String TOKEN = "4131c9936d259bae9d9d0ea239a4c1ecdb98d22c8b098390f5eb7de3fa8ce892";
    Map<String, String> expectedHeaders = Map.of("Authorization", "Bearer " + TOKEN,
            "Content-Type", "application/json",
            "Accept", "*/*");

    @Test
    void usingLocalRequestSpec(){
        RestAssured
                .given()
                    .spec(getDefaultRequestSpec())
                .when()
                    .get()
                .then()
                .statusCode(200);
    }

    private static RequestSpecification getDefaultRequestSpec(){
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URL + "users")
                .build();
    }
}
