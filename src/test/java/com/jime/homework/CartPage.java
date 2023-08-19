package com.jime.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CartPage extends MainPage {

    private By itmCarItem = By.className("shopping_cart_badge");
    private By btnCheckout = By.xpath("//*[@id='checkout']");

    public void verifyItemsAreAdded(){
        WebElement spnShoppingCart = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> driver.findElement(itmCarItem));
        Assert.assertEquals(Integer.valueOf(spnShoppingCart.getText()),2);

    }

    public void clickCheckout() {
        driver.findElement(btnCheckout).click();
    }
}
