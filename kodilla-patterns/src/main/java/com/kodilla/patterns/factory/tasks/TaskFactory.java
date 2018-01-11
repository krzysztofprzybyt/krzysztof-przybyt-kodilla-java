package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task DoTask(String task){
        switch (task){
            case SHOPPING:
                return new ShoppingTask("Shopping", "Carrot", 25.0);
            case PAINTING:
                return new PaintingTask("Painting", "blue", "wall");
            case DRIVING:
                return new DrivingTask("Driving", "to shop", "car");
                default:
                    return null;
        }
    }
}
