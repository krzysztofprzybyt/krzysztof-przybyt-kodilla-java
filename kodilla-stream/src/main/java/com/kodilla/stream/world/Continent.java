package com.kodilla.stream.world;

import java.util.*;

public class Continent {

    private final String continent;
    private final Set<Country> countries = new HashSet<>();


    public Continent(final String continent, final Country country) {
        this.continent = continent;
        this.countries.add(country);
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void addCountries(Country country){
        countries.add(country);
    }

    public String getContinent() {
        return continent;
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
