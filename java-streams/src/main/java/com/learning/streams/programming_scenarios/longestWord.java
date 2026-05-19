package com.learning.streams.programming_scenarios;
import java.util.*;

public class longestWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe", "zebra");
        String word = words.stream().max(Comparator.comparing(String::length)).orElse("");
        System.out.println(word);
    }
}
