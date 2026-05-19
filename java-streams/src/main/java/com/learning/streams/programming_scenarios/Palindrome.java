package com.learning.streams.programming_scenarios;

import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        List<String> palindromeNames = Arrays.asList("Telugu", "Tamil","Malayalam");
        System.out.println(findPalindromes(palindromeNames));
    }

    public static List<String> findPalindromes(List<String> palindromes){
        List<String> found = palindromes.stream().filter(s -> {
            return s.toLowerCase().contentEquals(new StringBuilder(s.toLowerCase()).reverse());
        }).toList();
        return found;
    }
}
