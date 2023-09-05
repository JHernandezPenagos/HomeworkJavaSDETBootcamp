package com.jime.appium.android.gestures;

import com.google.common.collect.ImmutableMap;
import com.jime.appium.android.AndroidBaseTest;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollExample extends AndroidBaseTest {
    @BeforeTest
    void goToView(){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
    }

    @Test(enabled = false)
    void scrollUIAutomatorTest() throws InterruptedException {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable()"));
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
        Thread.sleep(1500);
    }

    @Test
    void scrollUsingGesturesTest(){
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "Left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0
            ));

        }while (canScrollMore);

    }
}
