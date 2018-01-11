package com.kodilla.testing.totolotek2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> user = new HashSet<>();
        user.add(5);
        user.add(49);
        user.add(17);
        user.add(24);
        user.add(25);
        user.add(11);
        System.out.println(random());
        int count =0;
        long set6 = 0;
        System.out.println(count);

        while(count != 6){
            count = compare(user, random());
            set6++;
        }
        System.out.println(set6);
    }
    private static Set<Integer> random(){
        Set<Integer> randoms = new HashSet<>();
        Random rand = new Random();
        while (randoms.size()<6){
            randoms.add(rand.nextInt(49)+1);
        }

        return randoms;
    }
    static int compare(Set<Integer> user, Set<Integer> rand){
        int count = 0;

        for(int number:user){
            if(rand.contains(number)){
                count++;
            }
        }
        return count;
    }
}
