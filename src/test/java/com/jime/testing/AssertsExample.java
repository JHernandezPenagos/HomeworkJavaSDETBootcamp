package com.jime.testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsExample {

    int num1 = 1;
    int num2 = 2;

    private int sum(int num1, int num2){
        return num1 + num2;
    }

    @Test
    void testCorrectSum(){
        System.out.println("Step 1");
        Assert.assertEquals(sum(num1, num2), 3, "Sum is incorrect!");
    }

    @Test
    void verifyWrongSumSoftAssert(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Step 1");
        softAssert.assertEquals(sum(num1, num2), 10, "Sum is incorrect!");
        System.out.println("Step 2");
        Assert.fail("Error test!!");
        System.out.println("Step 3");
        softAssert.assertTrue(num1 == 1);
        softAssert.assertAll();
    }
}
