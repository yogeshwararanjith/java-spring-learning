package com.learning.streams.programming_scenarios;
import java.util.*;

public class thirdHighest {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> sortedList = listOfIntegers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedList.get(2));
    }
}
