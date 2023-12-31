package com.jime.selenium.commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTestClass {
    protected WebDriver driver;
    protected String demoSite = "https://demosite.titaniuminstitute.com.mx/wp-admin/admin.php?page=sch-dashboard";
    String username = "admin";
    String password = "G3-ySzY%";

    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) {
        switch (browser) {
            case "Chrome" -> {
                //WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            case "Edge" -> {
                //WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
            case "Firefox" -> {
                //WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            default -> System.err.println("Browser is not listed!");
        }

        driver.manage().window().maximize();
    }

    @AfterTest
    public void turnDown() {
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
