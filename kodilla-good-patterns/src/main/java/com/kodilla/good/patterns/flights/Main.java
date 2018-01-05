package com.kodilla.good.patterns.flights;


public class Main  {
    public static void main(String[] args) {
        FlightsFinder flightfinder = new FlightsFinder();

        flightfinder.flightsTo("WARSZAWA");
        flightfinder.flightsFrom("BERLIN");
        flightfinder.flightswithChange("RADOM", "POZNAŃ", "KRAKÓW");

        FlightsBase flightsBase = new FlightsBase();
        System.out.println(flightsBase.getFlights().size());
    }
}
