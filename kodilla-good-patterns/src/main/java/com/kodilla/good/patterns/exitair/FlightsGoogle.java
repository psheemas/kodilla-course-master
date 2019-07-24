package com.kodilla.good.patterns.exitair;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightsGoogle {
    AvailableConnections availableConnections = new AvailableConnections();
    public void flightGoogle() {
        System.out.println("Flight from Warsaw to Gdańsk via Katowice");

        Set<Flight> departureCity = availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDepartureCity() == "Warszawa")
                .collect(Collectors.toSet());

        Set<Flight> middleCity = availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDepartureCity() == "Katowice")
                .collect(Collectors.toSet());

        System.out.println("Flights from Warsaw to Katowice: ");
        Iterator<Flight> iterDepCity = departureCity.iterator();
        while (iterDepCity.hasNext()) {
            Flight midFlight = iterDepCity.next();
            if (midFlight.getDestinationCity() == "Katowice")
                System.out.println(midFlight);
        }
        System.out.println("Flights from Katowice to Warsaw: ");
        Iterator<Flight> iterMidCity = middleCity.iterator();
        while (iterMidCity.hasNext()) {
            Flight midFlight = iterMidCity.next();
            if (midFlight.getDestinationCity() == "Gdańsk")
                System.out.println(midFlight);
        }
    }
    public void findFlightFrom(String city){
        System.out.println("Flights from: " + city);
        System.out.println(availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDestinationCity() == "Warszawa")
                .map(listOfFlights -> listOfFlights.getFlightName())
                .collect(Collectors.toSet()));
    }

    public void findFlightsTo(String city){
        System.out.println("Flights to: " + city);
        System.out.println(availableConnections.getListOfFlights().stream()
                .filter(listOfFlights -> listOfFlights.getDestinationCity() == "Gdańsk")
                .map(listOfFlights -> listOfFlights.getFlightName())
                .collect(Collectors.toSet()));
    }
}
