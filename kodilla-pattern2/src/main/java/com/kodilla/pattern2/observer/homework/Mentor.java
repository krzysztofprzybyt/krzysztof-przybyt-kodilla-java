package com.kodilla.pattern2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String mentorName;
    private int exercisesToVerify;


    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentQueue studentQueue) {
        System.out.println(mentorName+ " you have "+ studentQueue.getExercises().size()+ " new exercises to verify for Student: "+ studentQueue.getStudentName());
        exercisesToVerify++;
    }

    public String getMentorName() {
        return mentorName;
    }
    public String pollExercise(StudentQueue studentQueue) {

        exercisesToVerify--;
        return studentQueue.getExercises().poll();
    }

    public int getExercisesToVerify() {

        return exercisesToVerify;
    }
}
