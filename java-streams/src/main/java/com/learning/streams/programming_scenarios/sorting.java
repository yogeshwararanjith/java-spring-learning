package com.learning.streams.programming_scenarios;

import java.util.*;

public class sorting {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++","COBOL", "C");

        // normal
//        listOfStrings.sort((a,b) -> a.length()-b.length());

        // with comparator.comparing
//        listOfStrings.sort(Comparator.comparing(str -> str.length()));

        // with method reference
        listOfStrings.sort(Comparator.comparing(String::length));
        System.out.println(listOfStrings);


        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98,21.12);
//        decimalList.sort(Comparator.comparingDouble(d ->(double)d).reversed());
        decimalList.sort(Comparator.reverseOrder());
        System.out.println(decimalList);
    }
}
