
package com.ti.sesion1;
import java.util.Scanner;
public class LogicOperators {
    public static void main(String[] args) {
        byte var1 = 10;
        byte var2 = 1;
        byte var3 = 10;
        byte var4 = 30;

        if(var1 > var2 || var3 == var4){
            System.out.println(var1 > var2);
            System.out.println(var3 == var4);
            System.out.println("one or both the conditions are true");
        }else {
            System.out.println("both are false");
        }
    }
}
