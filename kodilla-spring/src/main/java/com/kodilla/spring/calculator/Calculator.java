package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    private double val;
    @Autowired
    private Display display;

    double add(double a, double b){
        val = a+b;
        display.displayValue(val);
        return val;
    }
    double sub(double a, double b){
        val = a-b;
        display.displayValue(val);
        return val;
    }
    double mul(double a, double b){
        val = a*b;
        display.displayValue(val);
        return val;
    }
    double div(double a, double b){
        val = a/b;
        display.displayValue(val);
        return val;
    }
}
