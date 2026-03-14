package com.basics;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter expression (example: 2 + 3 - 4 =) ");

        double firstNumber = sc.nextDouble();
        calculator.accumulatedNums.add(firstNumber);

        while(true){
            String operator = sc.next();
            if(operator.equals("=")){
                break;
            }
            calculator.accumulatedOperators.add(operator);
            double nextNumber = sc.nextDouble();
            calculator.accumulatedNums.add(nextNumber);
        }

        System.out.println(calculator.accumulatedNums);
        System.out.println(calculator.accumulatedOperators);
        System.out.println("Result: "+ calculator.calculation());

    }
}