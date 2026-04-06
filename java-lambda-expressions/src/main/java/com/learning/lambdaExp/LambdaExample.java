package com.learning.lambdaExp;

interface Shape{
    void draw();
}

// traditional way

class Rectangle implements Shape{

    @Override
    public void draw(){
        System.out.println(getClass().getSimpleName()+" : draw() method");
    }
}

// lambda expressions way
public class LambdaExample {
    public static void main(String[] args) {

        Shape rect = new Rectangle();
        rect.draw();

        Shape rectangle = () -> System.out.println("Rectangle class : draw() method");
        rectangle.draw();

        Shape circle = () -> System.out.println("Circle class : draw() method");
        circle.draw();

        print(rectangle);
        print(circle);

        // more optimised way of passing lambda expression as argument
        print(()->System.out.println("Rectangle class : draw() method"));
        print(()->System.out.println("Circle class : draw() method"));
    }

    public static void print(Shape shape){
        shape.draw();
    }
}
