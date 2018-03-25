package com.kodilla.testing.konwersja;

import java.util.ArrayList;
import java.util.List;

public class KonwersjaLiczb {
    public static void main(String[] args) {
        konwersja(10680);
    }

    public static int konwersja(int liczba) {
        String znakiPoKonwersji = "";
        String znaki = String.valueOf(liczba);
        List<Character> listaZnakow = new ArrayList<>();

        for(char znak: znaki.toCharArray()) {
            listaZnakow.add(znak);
        }

        for(int i = listaZnakow.size()-1;i>=0;i--) {
            znakiPoKonwersji +=listaZnakow.get(i);
        }

        System.out.println(Integer.valueOf(znakiPoKonwersji));
        return Integer.valueOf(znakiPoKonwersji);
    }

    public int reverseNumber(int number){
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }
}
