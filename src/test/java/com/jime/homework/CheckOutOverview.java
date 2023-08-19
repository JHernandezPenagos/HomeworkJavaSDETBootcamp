package com.jime.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CheckOutOverview extends MainPage{
    private By itmOnesie = By.xpath("//*[@id='item_2_title_link']/div");
    private By itmBikeLight = By.xpath("//*[@id='item_0_title_link']/div");


    public void verifyItemOnesie(){
        WebElement itmNameOnesie = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> driver.findElement(itmOnesie));
        Assert.assertTrue(itmNameOnesie.getText().contains("Sauce Labs Onesie"));
        System.out.println("Verify item Onesie");

    }

    public void verifyItemBikeLight(){
        WebElement itmNameBikeLight = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> driver.findElement(itmBikeLight));
        Assert.assertTrue(itmNameBikeLight.getText().contains("Sauce Labs Bike Light"));
        System.out.println("Verify item Bike Light");

    }
}
