package com.kodilla.stream.world;

import java.util.*;

public class Continent {


    private final Set<Country> countries = new HashSet<>();


    public Set<Country> getCountries() {
        return countries;
    }

    public void addCountries(Country country){
        countries.add(country);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return countries != null ? countries.equals(continent.countries) : continent.countries == null;
    }

    @Override
    public int hashCode() {
        return countries != null ? countries.hashCode() : 0;
    }
}
