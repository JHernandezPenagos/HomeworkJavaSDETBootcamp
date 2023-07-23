package homework;

import java.util.Comparator;
import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {

        String str = "Hola";
        String result = "";

        for(int i = str.length()-1; i>=0; i--) {
            result += str.charAt(i);
        }

        System.out.println(result);

    }
}
