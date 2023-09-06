package com.jime.appium.patronesdediseño;

import com.jime.appium.BaseTest;
import com.ti.baseuimobile.MobileDriverFactory;
import org.testng.annotations.Test;

public class MobileDriverFactoryExample extends BaseTest {
    @Test
    void exampleTest() throws InterruptedException {
        MobileDriverFactory.getInstance().getMobileDriver();
        Thread.sleep(1500);
    }
}
