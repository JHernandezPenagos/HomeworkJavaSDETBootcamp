package com.jime.restassured.demo.testcases;

import com.ti.baseapi.BaseModel;
import com.ti.baseapi.RestAssuredUtils;
import com.ti.baseapi.RestAssuredUtilsOld;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.testng.annotations.BeforeTest;

import java.util.Map;

public class BaseTest extends BaseModel {
    protected Map<String, String> expectedHeaders = Map.of("Content-Type", "application/json");
    protected ResponseOptions<Response> response;

    @BeforeTest
    public void setup() {
        new RestAssuredUtils(BASE_URL, expectedHeaders);
    }
}
