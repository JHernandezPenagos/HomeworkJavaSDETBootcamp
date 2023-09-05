package com.jime.appium.android;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

public class AppiumActionsExample extends AndroidBaseTest {
    @Test
    void miscellaneous(){
        //driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        //driver.findElement(AppiumBy.xpath("//*[@content-desc='3. Preference dependencies']")).click();
        driver.executeScript("mobile: starActivity", ImmutableMap.of("intent", "io.appium.android.apis(io.appoium.android,apis.preference.PreferenceDependencies"));

        //Turn Screen
        DeviceRotation landScape = new DeviceRotation(0,0,90); //los valores de giro tienen que ser 0 -90 - 180 - 270
        driver.rotate(landScape);

        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        driver.findElement(AppiumBy.xpath("//*[text='WiFi settings']")).click();

        String alert = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        driver.findElement(AppiumBy.id("android:id/edit")).clear();
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Jimena Hdez");
        driver. findElements(AppiumBy.className("android.widget.Button")).get(1).click();

        //Assert.assertEquals(alert, "WiFi Settings");

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        //Thread.sleep(1500);
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
        //Thread.sleep(1500);

    }

}
