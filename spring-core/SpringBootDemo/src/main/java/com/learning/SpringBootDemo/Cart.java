package com.learning.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component
public class Cart {

    public void checkout(String source){
        System.out.println("Food is on the way from "+source+"...");
    }
}
