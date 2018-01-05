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
        flights.add(new Flight("WARSZAWA","ŁÓDŹ"));
        flights.add(new Flight("WARSZAWA","ŁÓDŹ"));
        flights.add(new Flight("WARSZAWA","ŁÓDŹ"));
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}
