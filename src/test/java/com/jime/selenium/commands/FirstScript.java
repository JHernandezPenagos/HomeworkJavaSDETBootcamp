package com.jime.selenium.commands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.time.chrono.ChronoLocalDate;

public class FirstScript {
    WebDriver driver;
    String demoSiteUrl = "https://demosite.titaniuminstitute.com.mx/wp-admin/admin.php?page=sch-dashboard";
    //necesita el protocolo (el http o https)
    String actResult = "";
    String expResult = "TI Demo Site"; //esto viene del Xpath

    @BeforeTest
    void setup(){
        WebDriverManager.chromedriver().setup();
        // con esto se abre el navegador
        driver = new ChromeDriver();
    }

    @Test
    void prueba(){
        // navegar al demo site
        //driver.get(demoSiteUrl);
        driver.navigate().to(demoSiteUrl);
        actResult = driver.getTitle(); //me trae el titulo de la pagina completa
        Assert.assertTrue(actResult.contains(expResult));

    }

    @AfterTest  // para que despues de que se ejecuten todas las pruebas, se pueda cerrar el navegador
    void turnDown(){
        driver.quit();
    }
}
