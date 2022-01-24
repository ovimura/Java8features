package apexsys;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import java.util.*;

public class Sample {

    public static void findImperative(List<String> symbols) {
//        Timeit.code(() -> {
//
//        });
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5,4,6,7,8,9,10);
//        for(int i=0; i<numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }
//        for(int e: numbers) {
//            System.out.println(e);
//        }
//        numbers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
//        numbers.forEach((Integer integer) -> {
//                System.out.println(integer);
//        });
//        numbers.forEach(integer -> { System.out.println(integer); });
//        numbers.forEach(System.out::println);

        //imperative
//        int result = 0;
//        for(int e: numbers) {
//            if( e > 3 && e % 2 == 0) {
//                result = e * 2;
//                break;
//            }
//        }
//        System.out.println(result);

        // declarative
        //functional(numbers);

//        numbers.stream()
//                .filter(e -> e > 3)
//                .filter(e -> e % 2 == 0)
//                .map(e -> e * 2)
//                .forEach(System.out:: println);


        // lazy evaluation .findFirst()
//        System.out.println(
//                numbers.stream()
//                        .filter(Sample::isGT3)
//                        .filter(Sample::isEven)
//                        .map(Sample::doubleIt)
//                        .findFirst());

        // highest stock price which is less than $500
        System.out.println();

    }

    public static boolean isGT3(int number) {
        System.out.println("isGT3 called for " + number);
        return  number > 3;
    }

    public static boolean isEven(int number) {
        System.out.println("isEven called for " + number);
        return number % 2 == 0;
    }

    public static int doubleIt(int number) {
        System.out.println("doubleIt called for " + number);
        return number * 2;
    }

    public static void functional(List<Integer> numbers) {
        System.out.println(
                numbers.stream()
                .filter(e -> e > 3)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .findFirst()
        );
    }
}
