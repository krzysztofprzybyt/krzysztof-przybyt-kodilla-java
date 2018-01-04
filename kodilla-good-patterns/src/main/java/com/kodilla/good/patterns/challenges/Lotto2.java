package com.kodilla.good.patterns.challenges;

import java.util.*;

public class Lotto2 {


    public static void main(String[] args) {

        Set<Integer> list = new HashSet<>();
        Set<Integer> listRandom = new HashSet<>();
        Scanner in = new Scanner(System.in);

        while(list.size()<6){
            System.out.println("Podaj liczbę: \n");

            int number = in.nextInt();
            if(number<50&&number>0){
                list.add(number);
            }
        }

        Random losowa = new Random();

        while(listRandom.size()<6){

            listRandom.add(losowa.nextInt(50));
        }

        System.out.println(list);
        System.out.println(listRandom);

        int wspolne = 0;

        for(int liczba:list){
            if(listRandom.contains(liczba)){
                wspolne++;
            }
        }
        System.out.println(wspolne);
    }
}
