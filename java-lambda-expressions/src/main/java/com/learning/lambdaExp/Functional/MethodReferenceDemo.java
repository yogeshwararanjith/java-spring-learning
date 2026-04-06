package com.learning.lambdaExp.Functional;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable{
    void print(String s);
}

public class MethodReferenceDemo{

    public static int addition(int a, int b){
        return (a+b);
    }

    public void display(String s){
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {

        // Lambda way
        BiFunction<Integer,Integer, Integer> biFunction = (a,b)-> MethodReferenceDemo.addition(a,b);
        System.out.println(biFunction.apply(10,20));

        // Method reference class::methodName
        BiFunction<Integer,Integer, Integer> add = MethodReferenceDemo::addition;
        System.out.println(add.apply(10,20));

        // method reference with object::methodName
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

        // lambda
        Printable printableImpl = (input) -> methodReferenceDemo.display(input);
        printableImpl.print("hello!");

        //method reference
        Printable pi = methodReferenceDemo::display;
        pi.print("Hello!!");

        // Method reference to constructor, class::new

        List<String> cars = new ArrayList<>();
        cars.add("Scorpio");
        cars.add("XUV");
        cars.add("Skoda");
        cars.add("Swift");
        cars.add("swift");

        // Lambda way
        Function<List<String>, Set<String>> carsSet = (carsList) -> new HashSet<>(carsList);
        System.out.println(carsSet.apply(cars));

        // method reference
        Function<List<String>, Set<String>> carsMethodRef = HashSet::new;
        System.out.println(carsMethodRef.apply(cars));
    }
}
