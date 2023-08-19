package com.jime.homework;

import com.ti.log4j2.Main;
import org.openqa.selenium.By;

public class LoginPage extends MainPage {

    private By txtUsername = By.id("user-name");

    private By txtPassword = By.id("password");

    private By btnLogin = By.id("login-button");

    private void typeUsername(String username) {
        driver.findElement(txtUsername).clear();
        driver.findElement(txtUsername).sendKeys(username);
    }

    private void typePassword(String password) {
        driver.findElement(txtPassword).clear();
        driver.findElement(txtPassword).sendKeys(password);
    }

    /*private void checkRememberMe() {
        driver.findElement(chkRememberMe).click();
    }
*/
    private void clickLogin() {
        driver.findElement(btnLogin).click();
    }

    public void login(String username, String password) {
        typeUsername(username);
        typePassword(password);
        clickLogin();
    }

}
