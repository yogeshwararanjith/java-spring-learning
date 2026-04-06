package com.learning.javaStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

record Product(int id, String name, double price){}

public class StreamFilterExample {

    public static void main(String[] args) {
    List<Product> products = new ArrayList<>();
    products = getProducts().stream().filter(prdct -> prdct.price()<200).collect(Collectors.toList());

    products.forEach(System.out::println);

    List<Product> sortedProducts = getProducts().stream().sorted(new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return (int)(o1.price()-o2.price());
        }
    }).collect(Collectors.toList());

    List<Product> sortedProducts1 = getProducts().stream().sorted((o1,o2)-> (int) (o1.price()-o2.price())).collect(Collectors.toList());

    sortedProducts.forEach(System.out::println);
    System.out.println("***************");
    List<Product> list = getProducts().stream().sorted(Comparator.comparingDouble(Product::price).reversed()).collect(Collectors.toList());

    list.forEach(System.out::println);
    }

    public static List<Product> getProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Panteen",150.00));
        products.add(new Product(1,"Sunsilk",250.00));
        products.add(new Product(1,"Meera",50.00));
        products.add(new Product(1,"Loreol",350.00));

        return products;
    }


}
