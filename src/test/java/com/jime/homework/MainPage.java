package com.jime.homework;

import com.ti.baseuiweb.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    WebDriver driver = DriverFactory.getInstance().getDriver();

    private By btnAddBabyClothes = By.id("add-to-cart-sauce-labs-onesie");

    private By btnAddBikeLight = By.id("add-to-cart-sauce-labs-bike-light");

    private By btnCart = By.id("shopping_cart_container");

    /*private String getSchoolName() {
        return driver.findElement(spnSchoolTitle).getText();
    }*/

    public void addBabyClothes(){
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(driver.findElement(btnAddBabyClothes)));
        driver.findElement(btnAddBabyClothes).click();
    }

    public void addBikeLight() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(driver.findElement(btnAddBikeLight)));
        driver.findElement(btnAddBikeLight).click();
    }

    public void openCart(){
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(driver.findElement(btnCart)));
        driver.findElement(btnCart).click();
    }

}
