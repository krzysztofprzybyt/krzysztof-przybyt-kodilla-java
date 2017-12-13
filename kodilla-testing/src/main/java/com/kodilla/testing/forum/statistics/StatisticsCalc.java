package com.kodilla.testing.forum.statistics;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.security.PublicKey;

public class StatisticsCalc {

    private int userCount;
    private int postCount;
    private int commentsCount;
    private double postOnUser;
    private double commentsOnUser;
    private double commentsOnPost;


    public void calculateAdvStatistics(Statistics statistics){
        this.userCount = statistics.usersNames().size();
        this.postCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        this.postOnUser = (double)postCount/userCount;
        this.commentsOnUser = (double)commentsCount/userCount;
        this.commentsOnPost = (double)commentsCount/postCount;

    }
    public void showStatistic(){
        System.out.println("Ilość użytkowników: " + userCount);
        System.out.println("Ilośc postów: " + postCount);
        System.out.println("Ilość komentarzy: " + commentsCount);
        System.out.println("Średnia ilość postów na użytkownika" + postOnUser);
        System.out.println("Średnia ilość komentarzy na użytkownika: " + commentsOnUser);
        System.out.println("Średnia ilość komentarzy na post: " + commentsOnPost);

    }


    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostOnUser() {
        return postOnUser;
    }

    public double getCommentsOnUser() {
        return commentsOnUser;
    }

    public double getCommentsOnPost() {
        return commentsOnPost;
    }
}
