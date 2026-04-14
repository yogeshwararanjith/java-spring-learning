package com.learning.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Item {

    @Autowired
    Cart cart;

    public void add(String source){
        cart.checkout(source);
    }
}
