package com.jime.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTestClass {
    protected WebDriver driver;
    protected String demoSite = "https://demosite.titaniuminstitute.com.mx/wp-admin/admin.php?page=sch-dashboard";
    protected String username = "admin";
    protected String password = "G3-ySzY%";

    @BeforeTest
    void setup() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chrome-mac-x64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    @AfterTest
    void turnDown() {
        driver.quit();
    }


    void wait(int seg) {
        try {
            Thread.sleep(seg * 1000);
        } catch (InterruptedException ie) {
            System.err.println(ie.getMessage());
        }
    }

}
