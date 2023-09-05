package com.jime.restassured;

import com.jime.restassured.dao.UserGorest;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.containsString;

public class HttpMethodsExample {
    private static final String BASE_URL = "https://gorest.co.in/public/v2/";
    private static final String TOKEN = "4131c9936d259bae9d9d0ea239a4c1ecdb98d22c8b098390f5eb7de3fa8ce892";
    Map<String, String> expectedHeaders = Map.of("Authorization", "Bearer " + TOKEN,
            "Content-Type", "application/json",
            "Accept", "*/*");
    List<UserGorest> userGorests = new ArrayList<>();

    @Test(priority = 1)
     void postExample(){
        RestAssured
                .given()
                .headers(expectedHeaders)
                .body("{\n" +
                "        \"name\": \"Pepito Perez1\",\n" +
                "        \"email\": \"pepito_perez2@schamberger.example\",\n" +
                "        \"gender\": \"male\",\n" +
                "        \"status\": \"active\"\n" +
                "    }")
                .when()
                    .post(BASE_URL + "users")
                .then()
                .statusCode(201);
    }

    @AfterMethod
    void getExample(){
        userGorests = RestAssured
                .given()
                .headers(expectedHeaders)
                .when()
                .get(BASE_URL + "users")
                .then()
                .extract()
                .body()
                .jsonPath()
                .getList(".", UserGorest.class);

    }

    @Test(priority = 2)
    void putExample(){
        RestAssured
                .given()
                    .headers(expectedHeaders)
                    .body("{\\n\" +\n" +
                        "                \"        \\\"name\\\": \\\"Pepito Perez1\\\",\\n\" +\n" +
                        "                \"        \\\"email\\\": \\\"pepito_perez2@schamberger.example\\\",\\n\" +\n" +
                        "                \"        \\\"gender\\\": \\\"male\\\",\\n\" +\n" +
                        "                \"        \\\"status\\\": \\\"active\\\"\\n\" +\n" +
                        "                \"    }")
                .when()
                    .put(BASE_URL +"users/" + userGorests.get(0).getId())
                .then()
                    .statusCode(200);

    }

    @Test(priority = 3)
    void deleteExample(){
        RestAssured
                .given()
                .headers(expectedHeaders)
                .when()
                .delete(BASE_URL + "users/" + userGorests.get(0).getId())
                .then()
                .statusCode(204);
    }


    @Test(enabled = false)
    void getNoBDD(){
        RestAssured.request(Method.GET, BASE_URL + "users")
                .then()
                .statusCode(200)
                .body("name[0]", containsString("Sher Singh"));

    }

    @Test(enabled = false)
    void traceExample(){
        RestAssured.request(Method.TRACE, BASE_URL)
                .then()
                .statusCode(405);
    }




}
