package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        System.out.println("Test - pierwszy test jednostkowy:");

        int add = Calculator.add(4, 5);
        int subtract = Calculator.subtract(7, 4);

        if(add == 9){
            System.out.println("test dodawania OK");
        } else {
            System.out.println("test dodawania - ERROR!");
        }
        if(subtract == 3){
            System.out.println("test odejmowania OK");
        } else {
            System.out.println("test odejmowania - ERROR!");
        }
    }
}
