package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("guava");

        System.out.println(fruits);

        //adding in particular indx
        fruits.add(2,"pine apple");
        System.out.println(fruits);
        fruits.addFirst("Sithaphal");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        fruits.forEach(el -> System.out.println(el));

    }
}
