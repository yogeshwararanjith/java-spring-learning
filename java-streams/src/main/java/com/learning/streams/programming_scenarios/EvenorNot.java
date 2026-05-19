package com.learning.streams.programming_scenarios;

import java.util.Arrays;
import java.util.List;

public class EvenorNot {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(22,10,2,33,54,77,81);

        boolean allEven = nums.stream().allMatch(num -> num%2 == 0);
        System.out.println("Result : "+ allEven);

        // starting with A
        List<String> nameList = Arrays.asList("Banana", "Apple", "Cat", "Andrew");
        boolean startingA = nameList.stream().anyMatch(i -> i.startsWith("A"));
        System.out.println(startingA);

        // numbers starting with 1;
        List<Integer> numbers = Arrays.asList(10, 12, 20, null, 19, 30);
        List<Integer> startingWithOne = numbers.stream().filter(num -> String.valueOf(num).startsWith("1")).toList();
        List<Integer> startingWith1 = numbers.stream().filter(num -> num != null).filter(num -> num.toString().startsWith("1")).toList();
        System.out.println(startingWith1);
        System.out.println(startingWithOne);
    }
}
