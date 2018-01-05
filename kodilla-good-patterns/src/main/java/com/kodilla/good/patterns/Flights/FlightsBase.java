package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsBase {
    final List<Flight> flights = new ArrayList<>();
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

    public List<Flight> getFlights() {
        return flights;
    }

}
