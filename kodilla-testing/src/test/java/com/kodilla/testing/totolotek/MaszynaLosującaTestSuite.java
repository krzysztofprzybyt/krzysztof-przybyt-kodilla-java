package com.kodilla.testing.totolotek;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MaszynaLosującaTestSuite {

    @Test
    public void testMaszynaLosujaca() {
        //Given
        Database mockDatabase = mock(Database.class);
        MaszynaLosujaca maszynaLosujaca = new MaszynaLosujaca(mockDatabase);

        List<Integer> wylospwaneLiczby = new ArrayList<>();
        wylospwaneLiczby.add(5);
        wylospwaneLiczby.add(35);
        wylospwaneLiczby.add(12);
        wylospwaneLiczby.add(6);
        wylospwaneLiczby.add(28);
        when(mockDatabase.wylosuj(5)).thenReturn(wylospwaneLiczby);

        //When
        List<Integer> podaneLiczby = new ArrayList<>();
        podaneLiczby.add(5);
        podaneLiczby.add(7);
        podaneLiczby.add(12);
        podaneLiczby.add(8);
        podaneLiczby.add(13);

        int wynik = maszynaLosujaca.miniLotto(podaneLiczby);

        //Then
        Assert.assertEquals(2, wynik);
        }
    }


