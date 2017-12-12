package com.kodilla.testing.shape;

public class Triangle implements Shape{

    public void getShapeName() {
        System.out.println("Square");
    }

    public void getField(double a, double h) {
        System.out.println("Pole trójkąta: "+a/2*h);
}
