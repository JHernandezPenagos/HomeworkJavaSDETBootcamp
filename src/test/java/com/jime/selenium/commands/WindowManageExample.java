package com.jime.selenium.commands;

import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class WindowManageExample extends BaseTestClass {
    @Test
    void manageWindows(){
        driver.navigate().to(demoSite);

        getSizeAndPosition();

        setSizeAndPosition();

        getSizeAndPosition();

        wait(2);

        driver.manage().window().maximize();

        wait(2);

        driver.manage().window().minimize();

        wait(2);

        driver.manage().window().fullscreen();


    }

    private void getSizeAndPosition(){
        Dimension size = driver.manage().window().getSize();
        System.out.println(String.format("La altura de la ventana es de: %d pixeles", size.height));;
        System.out.println(String.format("El ancho de la ventana es de: %d pixeles", size.width));;

        Point position = driver.manage().window().getPosition();
        System.out.println(String.format("La posicion en X de la ventana es: %d pixeles", position.getX()));
        System.out.println(String.format("La posicion en Y de la ventana es: %d pixeles", position.getY()));
    }

    private void setSizeAndPosition(){
        driver.manage().window().setSize(new Dimension(1024, 768));

        driver.manage().window().setPosition(new Point(0,0));

        //hay que tener cuidado con los Dimension porque hay Dimension de aws
    }



}
