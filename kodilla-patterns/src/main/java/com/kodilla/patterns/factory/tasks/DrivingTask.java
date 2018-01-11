package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName, where, using;
    boolean executed = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Task: "+taskName+" drive to "+where+" on the "+using+" - is execute");
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
