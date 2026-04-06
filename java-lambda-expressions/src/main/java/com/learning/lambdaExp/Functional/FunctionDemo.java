package com.learning.lambdaExp.Functional;

import java.util.function.Consumer;
import java.util.function.Function;

class FunctionImpl implements Function<String,Integer>{

    @Override
    public Integer apply(String string) {
        return string.length();
    }
}

public class FunctionDemo {

    public static void main(String[] args) {

        Function<String , Integer> function = (String string) ->  string.length();
        function.apply("Ranjith");

        Consumer<String> consumer = (String s) -> System.out.println(s);
        consumer.accept("Yogeshwara");
    }
}
