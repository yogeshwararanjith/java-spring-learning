package com.learning.streams.programming_scenarios;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Java Concept Of The Day";

        String reversed = Arrays.stream(str.split(" ")).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversed);
    }
}
