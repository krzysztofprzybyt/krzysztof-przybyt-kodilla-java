package com.kodilla.good.patterns.flights;

public class Flight {
    final String cityDeparture, cityArrival;

    public Flight(final String cityDeparture, final String cityArrival) {
        this.cityDeparture = cityDeparture;
        this.cityArrival = cityArrival;
    }

    public String getCityDeparture() {
        return cityDeparture;
    }

    public String getCityArrival() {
        return cityArrival;
    }
}

