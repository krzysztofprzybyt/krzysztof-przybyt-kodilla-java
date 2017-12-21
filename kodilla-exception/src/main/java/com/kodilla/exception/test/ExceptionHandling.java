package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1,2)+"\n");

        } catch (Exception e) {
            System.out.println("Wystąpił wyjątek: "+e+"\n");
        }  finally {
            System.out.println("~~~  Koniec zadania  ~~~");
        }
    }
}
