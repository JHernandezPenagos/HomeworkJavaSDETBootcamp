package com.jime.appium.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.BeforeTest;

public class AndroidBaseTest {

    public AndroidDriver driver;

    AppiumDriverLocalService service;

    @BeforeTest
    void setup() throws Exception{
        service = new AppiumServiceBuilder()
                .withArgument(()->"--use-pligins", "element-wait@2.0.3,gestures@3.0.0")
                .withIPAddress("127.0.9.1")
                .usingPort(4723)
                .build();
    }
}
