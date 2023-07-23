package com.jime.testing.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ItestContextExample {

    /*@DataProvider(name = "SchoolProvider")
    Object[][] getSchoolData(){
        return new Object[][]{
                {"Gil", "Braiant", "Luis", "Daniel"},
                {"Jimena", "Jen", "Ben", "Dans"},
                {"Juan", "Javi", "Loid", "Dona"}
        };
    }*/

    @Test(dataProvider = "getBookData", dataProviderClass = TestData.class, groups = "Smoke")
    void dataProviderITestSmoke(String title, String author, String year, String type){
        System.out.println(title);
        System.out.println(author);
        System.out.println(year);
        System.out.println(type);

    }

    @Test(dataProvider = "getBookData", dataProviderClass = TestData.class, groups = "Regression")
    void dataProviderITestRegression(String title, String author){
        System.out.println(title);
        System.out.println(author);

    }


}
