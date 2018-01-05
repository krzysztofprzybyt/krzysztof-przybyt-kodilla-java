package com.kodilla.good.patterns.Flights;

public class Main {
    public static void main(String[] args) {
        FlightsFinder flightfinder = new FlightsFinder();

        flightfinder.flightsTo("WARSZAWA");
        flightfinder.flightsFrom("BERLIN");
        flightfinder.flightswithChange("RADOM", "POZNAŃ", "KRAKÓW");
    }
}
