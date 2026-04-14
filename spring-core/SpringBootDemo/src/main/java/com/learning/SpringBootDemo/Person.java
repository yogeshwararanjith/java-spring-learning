package com.learning.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Value("Tarnaka")
    private String location;

    private Food food;

    // constructor injection
    public Person(@Qualifier("swiggy") Food food){
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

//
//    @Autowired
//    public void setFood(Food food) {
//        this.food = food;
//    }

    public String getLocation() {
        return location;
    }

    public void food(){
        food.orderFood();
    }
}
