package com.learning.streams.programming_scenarios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,5,2,10,15,2,15,7,18);

        List<Integer> streamList = list.stream().distinct().collect(Collectors.toList());
//        streamList.sort(Comparator.comparingInt(i->i));

        // method reference
        streamList.sort(Integer::compare);
        System.out.println(streamList);

        // without distinct
        HashSet<Integer> set = new HashSet<>();
        List<Integer> uniqueNums = list.stream().filter(set::add).collect(Collectors.toList());
        System.out.println(uniqueNums);

        // get duplicates
        HashSet<Integer> set1 = new HashSet<>();
        List<Integer> uniqueNums1 = list.stream().filter(num -> !set1.add(num)).collect(Collectors.toList());
        System.out.println(uniqueNums1);

        // sort in descending order
//        uniqueNums.sort(Comparator.comparingInt(a -> a).reversed());
        uniqueNums.sort(Comparator.comparingInt(Integer::intValue).reversed());
        System.out.println(uniqueNums);
    }
}
