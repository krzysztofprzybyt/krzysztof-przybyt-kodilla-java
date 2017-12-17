package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> map =  forum.getusersList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthday().getYear() <1997)
                .filter(forumUser -> forumUser.getUserPosts()>0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + map.size());
        map.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
         .forEach(System.out::println);

    }
}