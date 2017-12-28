package com.kodilla.rps;

public class Transformation {
    public static String transform (int znak){
        String a;
        switch (znak){
//            case '1':
//                a = "papier";
//                break;
//            case '2':
//                a = "kamień";
//                break;
//            case '3':
//                a = "nożyce";
//                break;
            case 1:
                a = "papier";
                break;
            case 2:
                a = "kamień";
                break;
            case 3:
                a = "nożyce";
                break;
            default: a = "-";
        }
        return a;
    }
}
