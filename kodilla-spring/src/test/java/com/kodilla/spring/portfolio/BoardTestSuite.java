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
        String done = board.getDoneList().tasks.get(0);
        String progress = board.getInProgressList().tasks.get(0);
        String toDo = board.getToDoList().tasks.get(0);
     //   System.out.println(toDo+" "+progress+" "+done);

        //Then
        Assert.assertEquals("to do", toDo);
        Assert.assertEquals("in progress", progress);
        Assert.assertEquals("done", done);
    }
}
