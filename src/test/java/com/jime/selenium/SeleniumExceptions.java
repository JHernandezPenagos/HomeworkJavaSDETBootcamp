package com.jime.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumExceptions {
    WebDriver driver;
    String demoSiteUrl = "https://demosite.titaniuminstitute.com.mx/wp-admin/admin.php?page=sch-dashboard";
    String actResult = ""; // el valor que quiero guardar para hacer la comparativa
    String expResult = "Titanium School"; // es lo que va a obtener
    String username = "admin";
    String password = "G3-ySzY%";

    @BeforeTest
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void firstTest() {
        try {
            driver.navigate().to(demoSiteUrl);
        } catch (InvalidArgumentException iae) {
            driver.navigate().to("https://"+ demoSiteUrl);
        }

        try {
            driver.findElement(By.id("user_logi")).sendKeys(username);
            Assert.assertTrue(true);
        } catch (NoSuchElementException nse){
            Assert.fail("Test Failes: element is not found: "+ nse.getMessage());
        }

    }

    @AfterTest
    void turnDown() {
        driver.quit();
    }
}
