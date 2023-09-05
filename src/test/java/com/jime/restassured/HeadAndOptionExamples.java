package com.jime.restassured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.emptyOrNullString;
import static org.hamcrest.Matchers.equalTo;

public class HeadAndOptionExamples {

    private static final String BASE_URL = "https://api.github.com/";

    @Test
    void headTest(){
        RestAssured.head()
                .then()
                .statusCode(200)
                .body(emptyOrNullString());
    }

    @Test
    void optionsTest(){
        RestAssured.options("https://reqres.in/")
                .then()
                .statusCode(204)
                .header("access-control-allow-methods", equalTo("GET, HEAD, PUT, PATCH"))
                .body(emptyOrNullString());
    }
}
