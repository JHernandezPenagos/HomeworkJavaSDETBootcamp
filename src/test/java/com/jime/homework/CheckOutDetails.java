package com.jime.homework;

import org.openqa.selenium.By;

public class CheckOutDetails extends MainPage{

    private By txtFirstName = By.id("first-name");

    private By txtLastName = By.id("last-name");

    private By txtZipCode = By.id("postal-code");
    private By btnContinue = By.xpath("//*[@id='continue']");

    private void typeFirstName(String firstname) {
        driver.findElement(txtFirstName).clear();
        driver.findElement(txtFirstName).sendKeys(firstname);
    }

    private void typeLastName(String lastname) {
        driver.findElement(txtLastName).clear();
        driver.findElement(txtLastName).sendKeys(lastname);
    }

    private void typeZipCode(String zipcode) {
        driver.findElement(txtZipCode).clear();
        driver.findElement(txtZipCode).sendKeys(zipcode);
    }

    private void clickContinue() {
        driver.findElement(btnContinue).click();
    }

    public void checkOutDetails(String firstname, String lastname, String zipcode) {
        typeFirstName(firstname);
        typeLastName(lastname);
        typeZipCode(zipcode);
        clickContinue();
    }

}
