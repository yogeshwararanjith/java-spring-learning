package com.learning.streams.programming_scenarios;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class anagrams {

    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        if(s1.length() != s2.length()) return;

        // hashmap
        Map<Character, Integer> freqs1 = new HashMap<>();
        Map<Character, Integer> freqs2 = new HashMap<>();

        for(char c : s1.toCharArray()){
            freqs1.put(c, freqs1.getOrDefault(c,0)+1);
        }

        for(char c : s2.toCharArray()){
            freqs2.put(c,freqs2.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : freqs1.entrySet()){
            if(!entry.getValue().equals(freqs2.get(entry.getKey()))){
                return;
            }
        }
        System.out.println(s1 +", "+ s2 +": are valid anagrams");


        // Stream

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).collect(Collectors.joining());

        if(s1.equals(s2)){
            System.out.println(s1 +", "+ s2 +": are valid anagrams");
        }else{
            System.out.println(s1 +", "+ s2 +": are not valid anagrams");
        }

    }
}
