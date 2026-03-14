package com.basics;

import java.util.ArrayList;

public class Calculator {

    ArrayList<Double> accumulatedNums = new ArrayList<Double>();
    ArrayList<String> accumulatedOperators = new ArrayList<String>();


    public double calculation(){
        double result = accumulatedNums.get(0);
        for (int i=1;i<accumulatedNums.size();i++){
            String operator = accumulatedOperators.get(i-1);
                switch (operator){
                    case "+":
                        result += accumulatedNums.get(i);
                        break;
                    case "-":
                        result -= accumulatedNums.get(i);
                        break;
                    case "*":
                        result *= accumulatedNums.get(i);
                        break;
                    case "/":
                        result /= accumulatedNums.get(i);
                        break;
                    default:
                        System.out.println("Invalid operator: " + operator);
                }

        }
        return result;
    }

}