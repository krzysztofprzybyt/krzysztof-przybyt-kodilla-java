package com.kodilla.testing.forum.statistics;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.security.PublicKey;

public class StatisticsCalc {

    private int userCount;
    private int postCount;
    private int commentsCount;
    private int postOnUser;
    private int commentsOnUser;
    private int commentsOnPost;


    public void calculateAdvStatistics(Statistics statistics){
        this.userCount = statistics.usersNames().size();
        this.postCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();

        if(userCount<=0) {
            this.postOnUser=0;
            this.commentsOnUser = 0;
        } else {
            this.postOnUser = postCount / userCount;
            this.commentsOnUser = commentsCount/userCount;
        }

        if(postCount<=0){
            this.commentsOnPost = 0;
        } else this.commentsOnPost = commentsCount/postCount;



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

    public int getPostOnUser() {
        return postOnUser;
    }

    public int getCommentsOnUser() {
        return commentsOnUser;
    }

    public int getCommentsOnPost() {
        return commentsOnPost;
    }
}
