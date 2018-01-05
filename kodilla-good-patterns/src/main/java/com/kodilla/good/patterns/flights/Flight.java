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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (cityDeparture != null ? !cityDeparture.equals(flight.cityDeparture) : flight.cityDeparture != null)
            return false;
        return cityArrival != null ? cityArrival.equals(flight.cityArrival) : flight.cityArrival == null;
    }

    @Override
    public int hashCode() {
        int result = cityDeparture != null ? cityDeparture.hashCode() : 0;
        result = 31 * result + (cityArrival != null ? cityArrival.hashCode() : 0);
        return result;
    }
}

