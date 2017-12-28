package com.kodilla.rps;

import java.util.Scanner;

public class KeyScan {
    static char znak(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
    static int liczba(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    static String tekst(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
