package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> pair = new ArrayList<Integer>();
        for(Integer even: numbers){
            if(even%2 == 0){
                pair.add(even);
            }
        }
        return pair;
    }
}
