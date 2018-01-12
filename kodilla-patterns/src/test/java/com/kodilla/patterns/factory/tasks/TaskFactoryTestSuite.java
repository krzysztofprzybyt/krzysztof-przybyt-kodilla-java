package com.kodilla.patterns.factory.tasks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Before
    public void start(){
        System.out.println("Start test -->");
    }
    @After
    public void end(){
        System.out.println("<-- End test\n");
    }
    @Test
    public void testFactoryShoppingTask(){
        //Given
        TaskFactory tasks = new TaskFactory();
        //When
        Task shopping = tasks.DoTask("SHOPPING");
        boolean execute = shopping.isTaskExecuted();
        String taskName = shopping.getTaskName();
        System.out.println(taskName+ " Task is executed: "+execute);
        shopping.executeTask();
        execute = shopping.isTaskExecuted();
        System.out.println(taskName+ "Task is executed: "+execute);

        Assert.assertEquals(true, execute);
        Assert.assertEquals("Shopping", taskName);
    }
    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory tasks = new TaskFactory();
        //When
        Task painting = tasks.DoTask("PAINTING");
        boolean execute = painting.isTaskExecuted();
        String taskName = painting.getTaskName();
        System.out.println(taskName+ " Task is executed: "+execute);
        painting.executeTask();
        execute = painting.isTaskExecuted();
        System.out.println(taskName+ "Task is executed: "+execute);

        Assert.assertEquals(true, execute);
        Assert.assertEquals("Painting", taskName);
    }
    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory tasks = new TaskFactory();
        //When
        Task driving = tasks.DoTask("DRIVING");
        boolean execute = driving.isTaskExecuted();
        String taskName = driving.getTaskName();
        System.out.println(taskName+ " Task is executed: "+execute);
        driving.executeTask();
        execute = driving.isTaskExecuted();
        System.out.println(taskName+ "Task is executed: "+execute);

        Assert.assertEquals(true, execute);
        Assert.assertEquals("Driving", taskName);
    }
}
