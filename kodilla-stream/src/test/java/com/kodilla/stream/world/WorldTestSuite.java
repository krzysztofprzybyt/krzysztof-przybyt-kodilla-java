package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        //Set<Country> europa = new HashSet<>();
        Country polska = new Country("Polska",new BigDecimal("38000000"));
        Country belgia = new Country("Belgium", new BigDecimal("10000000"));
        Country holandia = new Country("Holland", new BigDecimal("17000000"));
        Country chiny = new Country("China", new BigDecimal("1330000000"));
        Country japonia = new Country("Japan", new BigDecimal("127000000"));
        Country tajlandia = new Country("Tailand", new BigDecimal("65000000"));
        Country egipt = new Country("Egipt", new BigDecimal("82000000"));
        Country angola = new Country("Angola", new BigDecimal("17000000"));
        Country etiopia = new Country("Etiopia", new BigDecimal("78000000"));

        Continent europa = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();

        europa.addCountries(polska);
        europa.addCountries(belgia);
        europa.addCountries(holandia);
        asia.addCountries(chiny);
        asia.addCountries(japonia);
        asia.addCountries(tajlandia);
        africa.addCountries(egipt);
        africa.addCountries(angola);
        africa.addCountries(etiopia);

        World world = new World();
        world.addWorld(europa);
        world.addWorld(asia);
        world.addWorld(africa);



        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal expected = new BigDecimal("1764000000");
        Assert.assertEquals(expected, totalPeople);
    }
}
