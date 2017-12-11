package com.kodilla.testing.forum.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Collections: begin");
    }
    @After
    public void after(){
        System.out.println("Test Collections: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> lista = new ArrayList<Integer>();

        //When
        ArrayList<Integer> pair;
        pair =  new ArrayList<Integer>(OddNumbersExterminator.exterminate(lista));
        System.out.println("Test z pustą bazą");
        //Then
        Assert.assertEquals(lista.isEmpty(), pair.isEmpty());

    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        //When
        ArrayList<Integer> lista2 = new ArrayList<Integer>();

        lista2.add(2);
        lista2.add(4);

        ArrayList<Integer> pairs;
        pairs =  new ArrayList<Integer>(OddNumbersExterminator.exterminate(lista));
        System.out.println("Test z danymi");
        //Then
        Assert.assertEquals(lista2, pairs);
        //Assert.assertEquals(lista.get(3), pairs.get(1));



    }


}
