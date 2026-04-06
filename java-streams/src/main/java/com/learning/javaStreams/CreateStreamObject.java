package com.learning.javaStreams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import java.util.Set;

public class CreateStreamObject {

    public static void main(String[] args) {

        // creating stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);

        // creating a stream from sources
        Collection<String> collection = Arrays.asList("Java","C#","Python","Nodejs");
        Stream<String> streamSrc = collection.stream();
        streamSrc.forEach(System.out::println);

        // creating stream from list
        List<String> list = Arrays.asList("Java","C#","Python","Nodejs");
        Stream<String > streamList = list.stream();

        // from set
        Set<String> set = new HashSet<>(list);
        Stream<String> streamSet = set.stream();

        // from array
        String[] strArr = {"cricket","football"};
        Stream<String> streamStr = Arrays.stream(strArr);

    }
}
