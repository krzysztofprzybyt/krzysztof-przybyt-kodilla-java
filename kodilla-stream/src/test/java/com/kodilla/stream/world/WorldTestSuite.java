package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        world.addWorld(new Continent("Europe", new Country("Poland", new BigDecimal("38000000"))));
        world.addWorld(new Continent("Europe", new Country("Holland", new BigDecimal("17000000"))));
        world.addWorld(new Continent("Europe", new Country("Belgium", new BigDecimal("10000000"))));
        world.addWorld(new Continent("Asia", new Country("China", new BigDecimal("1330000000"))));
        world.addWorld(new Continent("Asia", new Country("Japan", new BigDecimal("127000000"))));
        world.addWorld(new Continent("Asia", new Country("Tailand", new BigDecimal("65000000"))));
        world.addWorld(new Continent("Africa", new Country("Egipt", new BigDecimal("82000000"))));
        world.addWorld(new Continent("Africa", new Country("Angola", new BigDecimal("17000000"))));
        world.addWorld(new Continent("Africa", new Country("Etiopia", new BigDecimal("78000000"))));
        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal expected = new BigDecimal("1764000000");
        Assert.assertEquals(expected, totalPeople);
    }
}
