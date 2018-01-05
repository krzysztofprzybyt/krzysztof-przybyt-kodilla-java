package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsBase {



    final Set<Flight> flights = new HashSet<>();
    {
        flights.add(new Flight("RADOM","WARSZAWA"));
        flights.add(new Flight("RADOM","POZNAŃ"));
        flights.add(new Flight("ŁÓDŹ","WARSZAWA"));
        flights.add(new Flight("ŁÓDŹ","POZNAŃ"));
        flights.add(new Flight("POZNAŃ","WARSZAWA"));
        flights.add(new Flight("POZNAŃ","KRAKÓW"));
        flights.add(new Flight("WARSZAWA","KRAKÓW"));
        flights.add(new Flight("WARSZAWA","ŁÓDŹ"));
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightsBase that = (FlightsBase) o;

        return flights != null ? flights.equals(that.flights) : that.flights == null;
    }

    @Override
    public int hashCode() {
        return flights != null ? flights.hashCode() : 0;
    }
}
