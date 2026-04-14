package com.learning.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {

    @Autowired
    Item item;

    public void selectItem(String source){
        item.add(source);
    }
}
