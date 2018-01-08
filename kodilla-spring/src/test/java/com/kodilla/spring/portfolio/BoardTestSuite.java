package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        boolean progress = board.getInProgressList().getTasks().isEmpty();
        boolean toDo = board.getToDoList().getTasks().isEmpty();
        boolean done = board.getDoneList().getTasks().isEmpty();
        System.out.println(toDo+" "+progress+" "+done);

        //Then
        Assert.assertEquals(true, toDo);
        Assert.assertEquals(true, progress);
        Assert.assertEquals(true, done);
    }
}
