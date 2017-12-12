package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shape = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        this.shape.add(shape);

    }

    public boolean removeFigure(Shape shape) {
        boolean results = false;
        if(this.shape.contains(shape)){
            this.shape.remove(shape);
            results = true;
        }
        return results;

    }

    public String getFigure(int n) {
        return this.shape.get(n).toString();

    }

    public void showFigures() {
        for(int i=0; i < this.shape.size(); i++){
            getFigure(i);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        return shape.equals(that.shape);
    }

    @Override
    public int hashCode() {
        return shape.hashCode();
    }
}