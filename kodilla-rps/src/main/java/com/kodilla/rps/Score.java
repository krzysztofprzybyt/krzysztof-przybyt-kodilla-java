package com.kodilla.rps;

import static com.kodilla.rps.KeyScan.znak;
import static com.kodilla.rps.Rps.rps;

public class Score {
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
    static boolean endOrReply(){
        boolean end = false;
        System.out.println("Jeśli chcesz zagrać ponownie naciśnij klawisz - n." +
                    "\nAby zakończyć naciśnik klawisz - x");

            char reply = znak();

            if(reply == 'x'){
                System.out.println("\nDziękuję za wspólną zabawę.\nDo zobaczenia!!!");
                end = true;
            } else if(reply == 'n') {
                end = true;
                rps();

            } else endOrReply();

            return end;
    }
}
