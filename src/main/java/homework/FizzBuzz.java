package homework;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {

        int value = 21;

        if((value % 7 == 0) && (value % 5 == 0)){
            System.out.println("FizzBuzz");
        } else if ((value % 5) == 0){
            System.out.println("Fizz");
        } else if(value % 7 == 0){
            System.out.println("Buzz");
        }

        IntStream.of(value).mapToObj(
                        i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);

    }

}
