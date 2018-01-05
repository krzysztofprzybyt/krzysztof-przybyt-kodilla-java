package com.kodilla.good.patterns.Flights;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightsFinder {
    FlightsBase flightsBase = new FlightsBase();

    public void flightsTo(String arrivalCity) {
        List<String> toB =flightsBase.getFlights().stream()
                .filter(f->f.getCityArrival().equals(arrivalCity))
                .map(d->d.getCityDeparture())
                .collect(Collectors.toList());
        if(!(toB.isEmpty())) {
            System.out.println("\nPorty lotnicze mające loty bezpośrednie do: "+arrivalCity+"\n"+toB);
        }else System.out.println("\nBrak lotów do: "+arrivalCity);
    }

    public void flightsFrom(String departureCity) {
        List<String> from =flightsBase.getFlights().stream()
                .filter(f->f.getCityDeparture().equals(departureCity))
                .map(d->d.getCityArrival())
                .collect(Collectors.toList());
        if(!(from.isEmpty())) {
            System.out.println("\nMożliwe loty z portu: "+departureCity+"\n"+from);
        }else System.out.println("\nBrak lotów z: "+departureCity);
    }

    public void flightswithChange(String departureCity, String changeCity, String arrivalCity) {
        long fromAToB = flightsBase.getFlights().stream()
                .filter(f->f.getCityArrival().equals(changeCity))
                .filter(f->f.getCityDeparture().equals(departureCity))
                .count();
        long fromBToC = flightsBase.getFlights().stream()
                .filter(f->f.getCityArrival().equals(arrivalCity))
                .filter(f->f.getCityDeparture().equals(changeCity))
                .count();
        if(fromAToB>0&&fromBToC>0){
            System.out.println("\nZnaleziono połączenie "+departureCity+" - "+changeCity+" - "+arrivalCity);
        } else System.out.println("\nNie występuje połączenie "+departureCity+" - "+changeCity+" - "+arrivalCity);
    }
}
