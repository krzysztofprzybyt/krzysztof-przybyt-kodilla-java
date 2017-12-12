package com.kodilla.testing.shape;

public class Square implements Shape {


    public void getShapeName() {
        System.out.println("Square");
    }

    public void getField(double a) {
        System.out.println("Pole kwadratu: "+Math.pow(a,2));
    }
}
