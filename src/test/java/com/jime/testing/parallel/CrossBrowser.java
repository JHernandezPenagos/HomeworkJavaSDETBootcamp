package com.jime.testing.parallel;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

    @Test
    @Parameters("browser")
    void executeCrossBrowser(String browser){
        String navigatorStarted;
        navigatorStarted = switch(browser.toLowerCase()){
            case "chrome" -> "Chrome Browser Started" + Thread.currentThread().threadId();
            case "firefox" -> "firefox Browser Started"+ Thread.currentThread().threadId();
            case "edge" -> "edge Browser Started"+ Thread.currentThread().threadId();
            case "safari" -> "safari Browser Started"+ Thread.currentThread().threadId();
            default -> "Not founded"+ Thread.currentThread().threadId();
        };

        System.out.println(navigatorStarted);
    }
}
