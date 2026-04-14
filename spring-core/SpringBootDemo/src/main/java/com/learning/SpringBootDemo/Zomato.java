package com.learning.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Zomato implements Food{

    private Order order;

    public Order getOrder() {
        return order;
    }

    @Autowired
    public void setOrder(Order order) {
        this.order = order;
    }

    public String getName(){
        return "Zomato";
    }

    public void orderFood(){
        order.selectItem(getName());
    }
}
