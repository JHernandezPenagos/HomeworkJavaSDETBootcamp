package com.jime.restassured;

//import org.apache.commons.compress.utils.Lists;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;
import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExample {

    String favoriteCar;
    List<String> list;

    @Test
    void stringIsEmpty(){
        String favoriteCar = "";
        assertThat(favoriteCar, emptyString());
    }

    @Test
    void stringIsEmptyorNull(){
        String favoriteCar = "";
        assertThat(favoriteCar, Matchers.nullValue());
    }

    @Test
    void stringIsEqualsTo(){
        String favoriteCar = "BMW";
        assertThat(favoriteCar, equalTo("BMW"));
    }

    @Test
    void stringEqualsToIgnoreCase(){
        favoriteCar = "HONDA";
        assertThat(favoriteCar, equalToIgnoringCase("honda"));
    }

    @Test
    void equalsToIgnoringWhitespaces(){
        favoriteCar = "     Nissan       ";
        assertThat(favoriteCar, equalToCompressingWhiteSpace("Nissan"));
    }

    @Test
    void stringContains(){
        favoriteCar = "Mercedes Benz";
        assertThat(favoriteCar, containsString("Ben"));
    }

    @Test
    void stringStartsWith(){
        favoriteCar = "Lamborgini";
        assertThat(favoriteCar, startsWith("Lamb"));
    }

    @Test
    void stringEndsWith(){
        favoriteCar = "Lamborgini";
        assertThat(favoriteCar, endsWith("gini"));
    }

    @Test
    void stringHasOrder(){
        favoriteCar = "Masserati Lamborgini Mercedez BMW";
        assertThat(favoriteCar, stringContainsInOrder(Lists.newArrayList("Masserati", "Lamborgini", "Mercedez", "BMW")));
    }

    //Number Matches
    @Test
    void greaterThanInteger(){
        assertThat(2, greaterThan(1));
    }

    @Test
    void greaterThanOrEqualInteger(){
        assertThat(10, greaterThanOrEqualTo(1));
    }

    @Test
    void lessThanInteger(){
        assertThat(-1, greaterThanOrEqualTo(1));
    }

    @Test
    void lessThanOrEqualsTo(){
        assertThat(-1, greaterThanOrEqualTo(-1));
    }

    @Test
    void closeToDoubleNumber(){
        //1.0(+/-)0.8 to 1.2
        assertThat(0.8, closeTo(1.0, 0.2));
    }

    @Test
    void givenBigDecimalCloseTo(){

        assertThat(new BigDecimal("2.6"), is(closeTo(new BigDecimal("2.8"), new BigDecimal("0.6"))));
    } //Transforma el texto en un Decimal. Existe BigInteger y transforma el texto en Integer


    //Collections Matchers
    @Test
    void ListEmpty(){
        List<String> list = new ArrayList<>();
        assertThat(list, empty());
    }

    @Test
    void ListSizeMatch(){
        list = Arrays.asList("Superman", "Batman", "Wonder-Woman", "Batichica");
        System.out.println(list.size());
        assertThat(list, hasSize(4));
        assertThat(list, iterableWithSize(4));
    }

    @Test
    void listContainsAllValuesInSameOrder(){
        list = Arrays.asList("Superman", "Batman", "Wonder-Woman", "Batichica");
        assertThat(list, containsInAnyOrder("Batman", "Batichica","Superman", "Wonder-Woman"));
    }

    @Test
    void listContainsValuesInRelativeOrder(){
        list = Arrays.asList("Superman", "Batman", "Wonder-Woman", "Batichica");
        assertThat(list, containsInRelativeOrder("Batman", "Wonder-Woman"));
    }

    @Test
    void listWhenContainsGivenValue(){
        list = Arrays.asList("Superman", "Batman", "Wonder-Woman", "Batichica");
        assertThat(list, hasItem(equalTo("Wonder-Woman")));
        assertThat(list, hasItem((startsWith("Sup"))));
        assertThat(list, hasItem(endsWith("man")));
    }

    @Test
    void listWhenContainsOneOrMoreValues(){
        list = Arrays.asList("Superman", "Batman", "Wonder-Woman", "Batichica");
        assertThat(list, hasItems(startsWith("Won"), endsWith("man"), equalTo("Superman")));
    }


}
