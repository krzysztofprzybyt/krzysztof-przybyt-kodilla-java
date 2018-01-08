package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDo")
    TaskList tasklist1;
    @Autowired
    @Qualifier("inProgres")
    TaskList tasklist2;
    @Autowired
    @Qualifier("done")
    TaskList tasklist3;
    @Bean
    public Board getTaskList(){
        Board board = new Board(tasklist1, tasklist2, tasklist3);
        return board;
    }
    @Bean(name="toDo")
    @Scope("prototype")
    public TaskList toDoList(){
        TaskList list = new TaskList();
        return list;
    }
    @Bean(name = "inProgres")
    @Scope("prototype")
    public TaskList inProgresList(){
        TaskList list = new TaskList();
        return list;
    }
    @Bean(name = "done")
    @Scope("prototype")
    public TaskList doneList(){
        TaskList list = new TaskList();
        return list;
    }
}
