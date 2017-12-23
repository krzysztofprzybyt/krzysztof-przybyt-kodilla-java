package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFilght(Flight flight) throws RouteNotFoundException{

        Flight flight1 = new Flight("London", "Paris");
        Flight flight2 = new Flight("London", "Washington");
        Flight flight3 = new Flight("Berlin", "Tokyo");
        Flight flight4 = new Flight("Rome", "Zagreb");

        final Map<String, Boolean> flights= new HashMap<>();
        flights.put(flight1.getArrivalAirport(), true);
        flights.put(flight2.getArrivalAirport(), true);
        flights.put(flight3.getArrivalAirport(), true);
        flights.put(flight4.getArrivalAirport(), true);
//        flights.put("Berlin", false);
//        flights.put("Moscow", false);




    }






    public static void main (String[] args){




    }
}


