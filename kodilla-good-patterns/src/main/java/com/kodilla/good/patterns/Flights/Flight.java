package com.kodilla.good.patterns.Flights;

public class Flight {
    final String CityDeparture, CityArrival;

    public Flight(final String cityDeparture, final String cityArrival) {
        CityDeparture = cityDeparture;
        CityArrival = cityArrival;
    }

    public String getCityDeparture() {
        return CityDeparture;
    }

    public String getCityArrival() {
        return CityArrival;
    }
}

