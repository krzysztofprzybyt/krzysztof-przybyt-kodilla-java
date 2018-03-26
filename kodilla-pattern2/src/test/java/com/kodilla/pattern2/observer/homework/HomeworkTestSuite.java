package com.kodilla.pattern2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentQueue chris  = new StudentQueue("Christoph");
        StudentQueue john = new StudentQueue("John");

        Mentor josef = new Mentor("Josef");
        Mentor ivone = new Mentor("Ivone");

        chris.addMentor(josef);
        john.addMentor(ivone);

        //When
        chris.addexerciseToVetify("first exercise");
        chris.addexerciseToVetify("second exercise");
        chris.addexerciseToVetify("firth exercise");
        chris.addexerciseToVetify("fourth exercise");

        System.out.println(josef.pollExercise(chris));
        System.out.println(josef.pollExercise(chris));

        chris.addexerciseToVetify("fifth exercise");

        //Then
        assertEquals(3,josef.getExercisesToVerify());

    }
}
