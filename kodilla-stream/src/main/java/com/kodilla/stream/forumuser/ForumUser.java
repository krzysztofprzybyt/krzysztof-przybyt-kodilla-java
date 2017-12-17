package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthday;
    private final int userPosts;

    public ForumUser(final int userId, final String userName, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int userPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthday = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.userPosts = userPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getUserPosts() {
        return userPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", userPosts=" + userPosts +
                '}';
    }
}
