package com.jime.testing.dataprovider;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData {

    @DataProvider(name = "SchoolProvider")
    Object[][] getSchoolData(){
        return new Object[][] {
                {"Gil", "Braiant", "Luis", "Daniel"},
                {"Jimena", "Jen", "Ben", "Dans"},
                {"Juan", "Javi", "Loid", "Dona"}
        };
    }

    @DataProvider
    Object[][] getBookData(ITestContext groupItest){
        Object[][] groupArray = null;

        for(String group :groupItest.getIncludedGroups()){
            if(group.equals("Smoke")){
                groupArray = new Object[][]{
                        {"Libro1", "JK Rowling", "1955", "Novela"},
                        {"Libro2", "John Katzebarg", "no data", "Novela"},
                        {"Libro3", "Isabel Allende", "1999", "Poema"},
                        {"Libro4", "Paulo Corinto", "2010", "Triller"}
                };
                break;
            } else if (group.equals("Regression")){
                groupArray = new Object[][]{
                        {"Libro1", "JK Rowling"},
                        {"Libro2", "John Katzebarg"}
                };
            }
            break;
        }
        return groupArray;
    }
}
