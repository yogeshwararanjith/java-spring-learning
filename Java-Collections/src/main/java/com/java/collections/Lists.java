package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        String[] items = {"apples","bananas","grapes"};

        var originalList = Arrays.asList(items);
        System.out.println(originalList);
        List<String> list = List.of(items);
        System.out.println(list);
//        list.add("pineapple");
//        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("milk");

        System.out.println(groceries);

        ArrayList<String> nxtList = new ArrayList<>(
                List.of("break","butter","cheese")
        );

        System.out.println(nxtList);

        nxtList.addAll(List.of("dal","rice","oil"));
        System.out.println(nxtList);
        nxtList.retainAll(List.of("dal","rice"));
        System.out.println(nxtList);

        var listArr = nxtList.toArray(new String[nxtList.size()]);
        System.out.println(Arrays.toString(listArr));
    }

}
