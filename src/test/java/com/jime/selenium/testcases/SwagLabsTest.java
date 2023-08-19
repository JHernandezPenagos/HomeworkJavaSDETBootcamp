package com.jime.selenium.testcases;

import com.jime.homework.*;
import com.ti.base.BrowserType;
import com.ti.base.DriverFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SwagLabsTest {

    String demoSiteUrl = "https://www.saucedemo.com/";
    String userName = "standard_user";
    String password = "secret_sauce";
    LoginPage loginPage; // Estoy creando una variable llamada loginPage de tipo LoginPage
    MainPage mainPage;
    CartPage cartPage;
    String firstName = "Jimena";
    String lastName = "Hdez";
    String zipCode = "1000";
    CheckOutDetails checkOutDetails;
    CheckOutOverview checkOutOverview;


    @BeforeTest
    @Parameters("browser")
    void setUp(String browser) {
        DriverFactory.getInstance().setDriver(BrowserType.valueOf(browser));
        DriverFactory.getInstance().getDriver().navigate().to(demoSiteUrl);

        loginPage = new LoginPage(); //la variable loginPage ya se vuelve un objeto tipo LoginPage porque cuenta con multiples cosas o metodos
        mainPage = new MainPage();
        cartPage = new CartPage();
        checkOutDetails = new CheckOutDetails();
        checkOutOverview = new CheckOutOverview();

        loginPage.login(userName, password);

    }

    @AfterTest
    void turnDown() {
        DriverFactory.getInstance().removeDriver();
    }

    @Test
    void test() {
        mainPage.addBabyClothes();
        mainPage.addBikeLight();
        mainPage.openCart();
        cartPage.verifyItemsAreAdded();
        cartPage.clickCheckout();
        checkOutDetails.checkOutDetails(firstName, lastName, zipCode);
        checkOutOverview.verifyItemOnesie();
        checkOutOverview.verifyItemBikeLight();

    }
}
