package com.learning.streams.programming_scenarios;
import java.util.*;

public class top3Elements {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        List<Integer> top3 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(top3);

    }
}
