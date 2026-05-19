package com.learning.streams.programming_scenarios;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumOfAllDigitsInNumber {
    public static void main(String[] args) {
        int i = 15623;
        // brute force
        int sum = 0;
        while(i != 0){
            sum += i%10;
            i /= 10;
        }
        System.out.println(sum);

        // Streams
        int n = 15623;
        Integer sumOfAllDigits = Stream.of(String.valueOf(n).split("")).collect(Collectors.summingInt(num->Integer.valueOf(num)));
        System.out.println(sumOfAllDigits);
    }
}
