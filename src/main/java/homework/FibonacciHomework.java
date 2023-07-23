package homework;

import java.util.stream.Stream;

public class FibonacciHomework {

    public static void main(String[] args) {
        Stream.iterate(new int[] {0,1}, t -> new int[]{
            t[1], t[0] + t[1]
        }).limit(10)
                .map(x -> x[0])
                .forEach(System.out::println);


       /* System.out.println("Fibonacci Series");

      *//*  int num1 = 0, num2 = 1, limit = 15;

        for (int i = 0; i < limit; i++) {
            System.out.println(num1 + " ");
            int sum = num1 + num2;

            num1 = num2;
            num2 = sum;
        }*/

    }
}
