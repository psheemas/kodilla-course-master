package com.kodilla.good.patterns.exitair;

public class Flight {
    private String flightName;
    private String departureCity;
    private String destinationCity;
    private String timeOfDeparture;
    private String timeOfArrival;

    public Flight(String flightName, String departureCity, String destinationCity, String timeOfDeparture, String timeOfArrival) {
        this.flightName = flightName;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    @Override
    public String toString() {
        return "Flight Name: " + getFlightName() + " | " + " Departure: " + getDepartureCity() + " | " + " Destination: " + getDestinationCity() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return flight.equals(flight.flightName);
    }
}
