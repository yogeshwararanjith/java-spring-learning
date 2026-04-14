package com.learning.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Swiggy implements Food{

    private Order order;

    public Order getOrder() {
        return order;
    }

    @Autowired
    public void setOrder(Order order) {
        this.order = order;
    }

    public String getName(){
        return "Swiggy";
    }

    public void orderFood(){
        order.selectItem(getName());
    }

}
