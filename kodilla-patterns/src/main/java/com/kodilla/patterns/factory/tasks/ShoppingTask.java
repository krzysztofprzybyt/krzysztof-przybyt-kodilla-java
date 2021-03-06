package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final private String taskName;
    final private String whatToBuy;
    final private double quantity;
    private boolean executed = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Task: "+taskName+" to buy "+whatToBuy+" in quantity: "+quantity+" - is execute");
        executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
