package com.jime.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FramesAndAlertsExample extends BaseTestClass{

    WebDriverWait wait;
    String w3cSiteUrl = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
    @Test
    void framesAlerts(){
        driver.navigate().to(w3cSiteUrl);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id("iframeResult"))));
        //driver.switchTo().frame("iframeResult");

        WebElement btnTry = driver.findElement(By.xpath("//button[text()='Try it']"));
        wait.until(ExpectedConditions.elementToBeClickable(btnTry));
        btnTry.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert altWindow = driver.switchTo().alert();

        System.out.println(altWindow.getText());
        altWindow.sendKeys("Jimena H.");
        altWindow.accept();

        String demoText = driver.findElement(By.id("demo")).getText();
        Assert.assertTrue(demoText.contains("Jime"), "Text not contained");
    }
}
