package com.java.collections;

import java.lang.reflect.Array;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> numberMapping = new HashMap<>();
        int[] numArr = {1,2,3,1};

        List<Integer> numbers = Arrays.stream(numArr).boxed().toList();

        Set<Integer> nums = new HashSet<>(numbers);
        nums.size();

        numberMapping.put("one",1);
        numberMapping.put("two",2);
        numberMapping.put("two",2);
        numberMapping.put("three",3);

        

        System.out.println(numberMapping);
        System.out.println(numberMapping.containsKey("one"));
        System.out.println(numberMapping.containsValue(5));

        numberMapping.remove("two");
        System.out.println(numberMapping);

        numberMapping.put("four",4);

        for(Map.Entry<String , Integer> entry : numberMapping.entrySet()){
            System.out.println("Key -> " + entry.getKey() + ", Value -> "+entry.getValue());
        }

        Iterator<Map.Entry<String, Integer>> iterator = numberMapping.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String ,Integer> entry = iterator.next();
            System.out.println("Key -> " + entry.getKey() + ", Value -> "+entry.getValue());
        }
    }
}
