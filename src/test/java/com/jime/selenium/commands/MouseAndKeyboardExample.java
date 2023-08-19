package com.jime.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class MouseAndKeyboardExample extends BaseTestClass {

    @Test
    void mouseAndKeyboard(){
        driver.navigate().to(demoSite);

        WebElement txtUsername = driver.findElement(By.id("user_login"));
        WebElement btnLogin = driver.findElement(By.xpath("//input[contains(@value,'Log')]"));

        Actions actionsBuilder = new Actions(driver);

        Action actionToLogin = actionsBuilder
                .moveToElement(txtUsername)
                .click()
                .sendKeys("admin")
                .sendKeys(Keys.TAB)
                .keyDown(Keys.SHIFT)
                .sendKeys("g")
                .keyUp(Keys.SHIFT)
                .sendKeys("3-ySz")
                .keyDown(Keys.SHIFT)
                .sendKeys("y")
                .keyUp(Keys.SHIFT)
                .sendKeys("%")
                .moveToElement(btnLogin)
                .click()
                .build();

        actionToLogin.perform();

        //actionsBuilder.moveToElement(driver.findElement(By.className("wpsp-userPic"))).build().perform();

        //driver.findElement(By.className("wpsp-userPic")).click();

        wait(4);
        WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement menAdmin = new WebDriverWait(driver, Duration.ofSeconds(8))
                .until(driver -> driver.findElement(By.xpath("(//span[text()='admin'])[3]")));
        menAdmin.click();

        waits.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign Out")));
        WebElement lnkSignOut = driver.findElement(By.linkText("Sign Out"));
        actionsBuilder.click(lnkSignOut).build().perform();


    }

}
