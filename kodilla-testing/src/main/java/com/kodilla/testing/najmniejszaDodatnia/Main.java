package com.kodilla.testing.najmniejszaDodatnia;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] lista = new int[]{1, 2, 4, 5};
        int result = solution(lista);
        wyswietlWynik(lista, result);
        int[] lista2 = new int[]{1, 4, 8, 3, 2};
        int result2 = solution(lista2);
        wyswietlWynik(lista2, result2);
        int[] lista3 = new int[]{-3, -1, -1, -1, -6, 0};
        int result3 = solution(lista3);
        wyswietlWynik(lista3, result3);
        int[] lista4 = new int[]{1, 3, 6, 4, 1, 2};
        int result4 = solution(lista4);
        wyswietlWynik(lista4, result4);
        int[] lista5 = new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3, 7};
        int result5 = solution(lista5);
        wyswietlWynik(lista5, result5);
    }

    public static void wyswietlWynik(int[] arr, int result) {
        StringBuilder builder = new StringBuilder();
        builder.append("Wynik dla tablicy: ");
        for (int a : arr) {
            builder.append(a);
            builder.append(" ");
        }
        builder.append("to: ");
        builder.append(result);
        System.out.println(builder.toString());
    }
    public static int solution(int[] lista){
        int result = 1;
//        Arrays.sort(lista);
//        for(int i = 0; i < lista.length-1; i++){
//            if((lista[i+1]-lista[i])>1&&lista[i]>0){
//                return result = lista[i]+1;
//            }
//        }
        Set<Integer> liczby= new HashSet<>();
        for(int liczba: lista){
            liczby.add(liczba);
        }
        while(liczby.contains(result)){
            result++;
        }
        return result;
    }

}
