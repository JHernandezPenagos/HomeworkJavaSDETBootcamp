package com.jime.testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class AnnotationExample {

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Esto se ejecuta ANTES de cada metodo de prueba");
    }

    @Test
    void testSum(){
        System.out.println("Este es un test para probar un metodo de suma");

    }

    @Test
    void testSub(){
        System.out.println("Este es un test para probar un metodo de resta");

    }

    @AfterMethod
    void afterMethod(){
        System.out.println("Esto se ejecuta DESPUES de cada metodo de prueba");
    }
}
