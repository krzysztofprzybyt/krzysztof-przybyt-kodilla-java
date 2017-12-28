package com.kodilla.rps;

import static com.kodilla.rps.KeyScan.*;
import static com.kodilla.rps.Score.*;
import static com.kodilla.rps.Transformation.transform;

public class Rps {


    public static void rps(){
        boolean end = false;
        int userPoints=0;
        int compPoints=0;
        int runda = 0;
        int compMove;
        int userMove;
        int userChoise;

        System.out.println("To jest gra:\nPapier - Kamień - Nożyce");
        System.out.println("Podaj swoje imię:");
        String imie = tekst();

        System.out.println("Podaj liczbę wygranych rund po których następuje zwycięstwo: ");
        int iloscRund = liczba();

        System.out.println("Witaj "+imie);
        System.out.println("Obsługa gry, polega na wyborze odpowiedniego klawisza na klawiaturze:");
        System.out.println("1 - zagranie \"kamień\"");
        System.out.println("2 - zagranie \"papier\"");
        System.out.println("3 - zagranie \"nożyce\"");
        System.out.println("x - zakończenie gry");
        System.out.println("n - nowa gra");

        while (!end) {

            System.out.println(imie+" wykonaj swój ruch:");
            userChoise = znak();
            userMove = Character.getNumericValue(userChoise);

            if(userChoise=='x'){
                System.out.println("Czy na pewno zakończyć grę?   t/n");
                if(znak()=='t') {
                    end = true;
                }
            }else if(userChoise=='n'){
                System.out.println("Czy na pewno zakończyć aktualną grę?   t/n");
                if(znak()=='t') {
                    end = true;
                    rps();
                }
            }else{

                compMove = (int)(Math.random() * 3 + 1);
                int compares =compare(userMove, compMove);

                switch(compares){
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
                        end =info(iloscRund, compPoints, userPoints);
                        break;
                    default:
                        System.out.println("Wybrano nieodpowiedni symbol.\nSpróbuj ponownie");

                }
            }
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
}
