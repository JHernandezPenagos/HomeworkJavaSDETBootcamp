package com.jime.selenium.commands;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class WindowAndTabExample extends BaseTestClass{
    String googleSite = "https://www.google.com";
    String WpSchoolURL = "https://wpschoolpress.com/";

    @Test
    void manageWindowsAndTabs(){
        driver.navigate().to(demoSite);
        String originalTab = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(WpSchoolURL);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to(googleSite);

        driver.switchTo().window(originalTab);
        driver.close();
        wait(2);



    }

}
