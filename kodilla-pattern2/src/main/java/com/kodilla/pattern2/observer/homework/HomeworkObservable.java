package com.kodilla.pattern2.observer.homework;

public interface HomeworkObservable {

    public void addMentor(HomeworkObserver homeworkObserver);
    public void notifyMentor();

}
