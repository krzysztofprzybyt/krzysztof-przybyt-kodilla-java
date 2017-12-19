package com.kodilla.stream.world;

import java.math.BigDecimal;

import java.util.HashSet;

import java.util.Set;


public class World {

    private final Set<Continent> allWorld = new HashSet<>();

    public void addWorld(final Continent continent){
        this.allWorld.add(continent);

    }

    public BigDecimal getPeopleQuantity() {

        return allWorld.stream()
                .flatMap(allWorld -> allWorld.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
