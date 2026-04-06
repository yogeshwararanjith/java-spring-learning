package com.learning.lambdaExp;


class ThreadDemo implements Runnable{

    @Override
    public void run(){
        System.out.println("run method called...");
    }
}

public class RunnableLambda {
    public static void main(String[] args) {

        //traditional way
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        // lambda way
        Runnable runnable = () -> System.out.println("run method called with runnable");
        Thread threadLmbda = new Thread(runnable);
        threadLmbda.start();

        // more optimised passing lambda exp as parameter
        Thread thread1 = new Thread( () -> System.out.println("run method called with lambda"));
        thread1.start();

        // with method reference
        Thread thread2 = new Thread(System.out::println);
    }
}


