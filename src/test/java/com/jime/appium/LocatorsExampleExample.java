package com.jime.appium;

import com.jime.appium.android.AndroidBaseTest;
import com.jime.restassured.demo.testcases.BaseTest;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class LocatorsExampleExample extends AndroidBaseTest {

    @Test

    void verifyWifiSettingsAreModified() throws InterruptedException{
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.xpath("//*[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();


    }
}
