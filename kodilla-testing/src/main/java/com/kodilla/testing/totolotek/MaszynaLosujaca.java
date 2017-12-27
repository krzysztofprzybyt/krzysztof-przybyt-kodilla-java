package com.kodilla.testing.totolotek;

import java.util.List;

public class MaszynaLosujaca {

    Database database;

    public MaszynaLosujaca(Database database) {
        this.database = database;
    }

    public int miniLotto(List<Integer> podaneLiczby){
        int wynik = 0;

        List<Integer> wylosuj = database.wylosuj(5);

        for(Integer liczba: podaneLiczby){
            if(wylosuj.contains(liczba)) {
                wynik += 1;
            }
        }


        return wynik;
    }


}
