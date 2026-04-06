package com.learning.streams.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class StreamsPractice {

    public static void main(String[] args) {

        // sum of all elements in list
        List<Integer> nums = List.of(1,2,3,4,5);
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
//        int sum = nums.stream().map(new Function<Integer, Integer>() {
//            public Integer apply(Integer num) {
//                return num;
//            }
//        }).mapToInt(num -> num).sum();

        // product of all elements in list
        List<Integer> nums1 = Arrays.asList(1,2,3,4,5);
        int prdct = nums1.stream().reduce(1,(a,b)->a*b);
        System.out.println(prdct);

        // average of all elements in list
        List<Integer> nums2 = Arrays.asList(10,20,15,35,50,75);
//        int sum1 = nums2.stream().mapToInt(Integer::intValue).sum();
        double avg = nums2.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(avg);

        //finding max el
        int max = nums2.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }).orElse(0);
        System.out.println(max);

        int min = nums2.stream().min(Integer::compare).orElse(0);
        System.out.println(min);
    }
}
