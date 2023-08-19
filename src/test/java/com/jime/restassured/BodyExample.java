package com.jime.restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Map;

public class BodyExample {

    private static final String BASE_URL = "https://api.github.com/rate_limit";
    Response response;

    @BeforeTest
    void setup(){
        response = RestAssured.get(BASE_URL);
    }

    @Test
    void jsonPathReturnsMap(){
        ResponseBody<?> body = response.body();

        JsonPath jsonPath = response.body().jsonPath();
        JsonPath jsonPath2 = response.body().jsonPath();

        Map<String, String> fullJson = jsonPath2.get();
        Map<String, String> subMap = jsonPath2.get("resources");
        Map<String, String> subMap2 = jsonPath2.get("resources.core");

        int coreLimit = jsonPath.get("resources.core.limit");
        int graphqlRemaining = jsonPath.get("resources.graphql.remaining");

        System.out.println(fullJson);
        System.out.println(subMap);
        System.out.println(subMap2);
        System.out.println(coreLimit);
        System.out.println(graphqlRemaining);

        Assert.assertEquals(coreLimit, 60);
        Assert.assertEquals(graphqlRemaining, 0);

    }

    @Test
    void castingFailure(){
        JsonPath jsonPath = RestAssured.get(BASE_URL).body().jsonPath();

        Map<String, String> isNull = jsonPath.get("asaasass.sasss");
        System.out.println(jsonPath.get("asaasass.sasss").toString());
    }
}
