package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> arrivalPorts = new HashMap<>();
    public void findFilght(Flight flight) throws RouteNotFoundException{
        arrivalPorts.put("London", true);
        arrivalPorts.put("Washington", true);
        arrivalPorts.put("Zagreb", true);
        arrivalPorts.put("Tokyo", true);
        //System.out.println(arrivalPorts.keySet());
        if(arrivalPorts.get(flight.getArrivalAirport())!=null) {
            System.out.println("Lot do "+flight.getArrivalAirport() + " jest możliwy");
        } else throw new RouteNotFoundException();
    }
    public static void main (String args[]){
        FlightFinder test = new FlightFinder();
        try {
            test.findFilght(new Flight("wa","London"));
        } catch (RouteNotFoundException e) {
            System.out.println("Lot niemożliwy, brak lotniska w miejscu docelowym");
        }

    }






}


