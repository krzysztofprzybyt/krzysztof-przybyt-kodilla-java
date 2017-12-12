package com.kodilla.testing.shape;

public class Circle implements Shape {

    public void getShapeName() {
        System.out.println("Circle");
    }

    public void getField(double r) {
        System.out.println("Pole koła: "+Math.PI*Math.pow(r,2));
    }
}
