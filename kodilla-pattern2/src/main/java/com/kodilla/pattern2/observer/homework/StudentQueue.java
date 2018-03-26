package com.kodilla.pattern2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentQueue implements HomeworkObservable {
    private final List<HomeworkObserver> observers;
    private final Deque<String> exercises;
    private final String studentName;

    public StudentQueue(String studentName) {
        observers = new ArrayList<>();
        exercises = new ArrayDeque<>();
        this.studentName = studentName;
    }

    public void addexerciseToVetify(String exercise) {
        exercises.offer(exercise);
        notifyMentor();
    }
    @Override
    public void addMentor(HomeworkObserver homeworkObserver) {
        observers.add(homeworkObserver);

    }
    @Override
    public void notifyMentor() {
        for(HomeworkObserver homeworkObserver: observers)
        homeworkObserver.update(this);
    }


    public Deque<String> getExercises() {
        return exercises;
    }

    public String getStudentName() {
        return studentName;
    }
}
