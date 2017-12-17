package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {


    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add((new ForumUser(1, "Jan", 'M',
                1997,11,4, 20)));
        usersList.add((new ForumUser(2, "Anna", 'F',
                1999,2,17, 10)));
        usersList.add((new ForumUser(3, "Krzysztof", 'M',
                1999,6,7, 200)));
        usersList.add((new ForumUser(4, "Agata", 'F',
                2001,12,12, 50)));
        usersList.add((new ForumUser(5, "Zygmunt", 'M',
                1978,8,30, 80)));
        usersList.add((new ForumUser(6, "Joanna", 'F',
                1982,12,22, 2)));
        usersList.add((new ForumUser(7, "Jan", 'M',
                1991,2,7, 47)));
        usersList.add((new ForumUser(8, "Jan", 'M',
                1990,2,8, 0)));

    }

    public List<ForumUser> getusersList() {
        return new ArrayList<>(usersList);
    }
}
