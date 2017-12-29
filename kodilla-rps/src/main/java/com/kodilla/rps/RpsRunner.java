package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    protected static Scanner scanner = new Scanner(System.in);

    public  void rps(){
        boolean end = false;
        int userPoints=0;
        int compPoints=0;
        int runda = 0;
        int compMove;
        int userMove;
        int userChoise;

        System.out.println("To jest gra:\nPapier - Kamień - Nożyce");
        System.out.println("Podaj swoje imię:");
        String imie = scanner.nextLine();

        System.out.println("Podaj liczbę wygranych rund po których następuje zwycięstwo: ");
        int iloscRund = scanner.nextInt();

        System.out.println("Witaj "+imie);
        System.out.println("Obsługa gry, polega na wyborze odpowiedniego klawisza na klawiaturze:");
        System.out.println("1 - zagranie \"papier\"");
        System.out.println("2 - zagranie \"kamień\"");
        System.out.println("3 - zagranie \"nożyce\"");
        System.out.println("x - zakończenie gry");
        System.out.println("n - nowa gra");

        while (!end) {
            System.out.println(imie+" wykonaj swój ruch:");
            userChoise = scanner.next().charAt(0);
            userMove = Character.getNumericValue(userChoise);

            if(userChoise=='x'){
                System.out.println("Czy na pewno zakończyć grę?   t/n");
                if(scanner.next().charAt(0)=='t') {
                    scanner.close();
                    end = true;
                }
            }else if(userChoise=='n'){
                System.out.println("Czy na pewno zakończyć aktualną grę?   t/n");
                if(scanner.next().charAt(0)=='t') {
                    end = true;
                    rps();
                }
            }else {
                compMove = (int) (Math.random() * 3 + 1);
                int compares = compare(userMove, compMove);

                switch (compares) {
                    case 0:
                        runda++;
                        rundsInfo(runda, userMove, compMove);
                        System.out.println("Remis");
                        end = info(iloscRund, compPoints, userPoints);
                        break;
                    case 1:
                        runda++;
                        rundsInfo(runda, userMove, compMove);
                        System.out.println("Punkt dla gracza");
                        userPoints++;
                        end = info(iloscRund, compPoints, userPoints);
                        break;
                    case -1:
                        runda++;
                        rundsInfo(runda, userMove, compMove);
                        System.out.println("Punkt dla komputera");
                        compPoints++;
                        end = info(iloscRund, compPoints, userPoints);
                        break;
                    default:
                        System.out.println("Wybrano nieodpowiedni symbol.\nSpróbuj ponownie");
                }
            }
        }
    }
    public static String transform (int znak){
        switch (znak){
            case 1:
                return "papier";
            case 2:
                return "kamień";
            case 3:
                return "nożyce";
            default: return  "-";
        }
    }
    public static void rundsInfo(int runda, int userMove, int compMove){
        System.out.println("\n~~RUNDA nr: "+runda+" ~~");
        System.out.println("Gracz: "+ transform(userMove));
        System.out.println("Komputer: "+ transform(compMove));
    }

    public static int compare(int userMove, int compMove){
        if(userMove==compMove){
            return 0;
        }
        switch(userMove){
            case 1:
                return (compMove==2?1:-1);
            case 2:
                return (compMove==3?1:-1);
            case 3:
                return (compMove==1?1:-1);
        }
        return 0;
    }
    static boolean info(int iloscRund, int rundsCom, int rundsUser) {
        System.out.println("Punkty:");
        System.out.println("Gracz: " + rundsUser);
        System.out.println("Komputer: " + rundsCom);

        if (rundsUser == iloscRund) {
            System.out.println("Gratuluję zwycięstwa !!!\n");
            return endOrReply();
        } else if (rundsCom == iloscRund) {
            System.out.println("Niestety przegrałeś.\nTym razem komputer miał więcej szczęścia...\n");
            return endOrReply();
        }
        return false;
    }
    public static boolean endOrReply(){
        boolean end = true;
        System.out.println("Jeśli chcesz zagrać ponownie naciśnij klawisz - n." +
                "\nAby zakończyć naciśnik klawisz - x");
        char reply = scanner.next().charAt(0);

        if(reply == 'x'){
            System.out.println("\nDziękuję za wspólną zabawę.\nDo zobaczenia!!!");
            scanner.close();
            return end;
        } else if(reply == 'n') {
            RpsRunner rps = new RpsRunner();
            rps.rps();
        } else endOrReply();
        return end;
    }

    public static void main(String[] args){

       RpsRunner rps = new RpsRunner();
       rps.rps();
    }
}

