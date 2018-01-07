package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    Board board;
    @Bean
    public Board getTaskList(){
        Board board = new Board(toDoList(), inProgresList(), doneList());
        return board;
    }
    @Bean
    @Scope("prototype")
    public TaskList toDoList(){
        TaskList list = new TaskList();
        list.tasks.add("to do");
        return list;
    }
    @Bean
    @Scope("prototype")
    public TaskList inProgresList(){
        TaskList list = new TaskList();
        list.tasks.add("in progress");
        return list;
    }
    @Bean
    @Scope("prototype")
    public TaskList doneList(){
        TaskList list = new TaskList();
        list.tasks.add("done");
        return list;
    }
}
