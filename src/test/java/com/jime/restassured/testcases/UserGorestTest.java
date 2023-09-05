package com.jime.restassured.testcases;

import org.testng.annotations.Test;
import com.jime.restassured.dao.UserGorest;

import static com.ti.baseapi.RestAssuredUtilsOld.*;
import static com.ti.baseapi.RestAssuredUtilsOld.getElements;

public class UserGorestTest extends BaseTestClass{

    @Test(priority = 1)
    void postExample() {
        response = postWithBody("users", postUserData);
        System.out.printf("The user created is %s", response.getBody().prettyPrint());
    }

    @Test(priority = 2)
    void getExample() {
        response = getElements("users");
        userGorests = response.getBody().jsonPath().getList(".", UserGorest.class);
        System.out.println(userGorests.get(0).getName());
    }

    @Test(priority = 3)
    void putExample() {
        response = putWithBody("users/" + userGorests.get(0).getId(), putUserData);
        response = getElements("users");
        userGorests = response.getBody().jsonPath().getList(".", UserGorest.class);

    }

    @Test(priority = 4)
    void deleteExample() {
        //implementa el delete

        //Trae de nuevo la lista y valida que no exista el usuario borrado

        System.out.printf("The User deleted is %s", response.getBody().prettyPrint());
        response = deleteElement("users/" + userGorests.get(0).getName());
    }
}
