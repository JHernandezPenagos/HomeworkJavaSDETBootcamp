/*package com.jime.selenium.pf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends MainPage {
    //private By txtUsername = By.id("user_login");
    @FindBy(id = "user login¡")
    private WebElement txtUsername;

    @FindBy(name = "pwd")
    private WebElement txtPassword;
    //private By txtPassword = By.name("pwd");

    @FindBy(css = "#rememberme")
    private WebElement chkRememberMe;
    //private By chkRememberMe = By.cssSelector("#rememberme");


    @FindBy(xpath = "//input[contains(@value,'Log')]")
    private WebElement btnLogin;
    //private By btnLogin = By.xpath("//input[contains(@value,'Log')]");

    *//*private void typeUsername(String username) {
        //driver.findElement(txtUsername).clear();
        //driver.findElement(txtUsername).sendKeys(username);
        txtUsername.clear();
        txtUsername.sendKeys(username);
    }*//*

    public LoginPage loginAs (String username) {
        txtUsername.clear();
        txtUsername.sendKeys(username);
        return this;
    }

    public LoginPage withPassword (String username) {
        txtUsername.clear();
        txtUsername.sendKeys(username);
        return this;
    }

    *//*private void typePassword(String password) {
        //driver.findElement(txtPassword).clear();
        //driver.findElement(txtPassword).sendKeys(password);
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }*//*

    private void checkRememberMe() { chkRememberMe.click();
        //driver.findElement(chkRememberMe).click();
    }

    private void checkRememberMe() { chkRememberMe.click();
        //driver.findElement(chkRememberMe).click();
    }

    private void clickLogin() { btnLogin.click();

        //driver.findElement(btnLogin).click();
    }

*//*    public void login(String username, String password) {
        typeUsername(username);
        typePassword(password);
        checkRememberMe();
        clickLogin();
    }*//*
}*/
