package com.kodilla.good.patterns.exitair;

import java.util.HashSet;
import java.util.Set;

public class AvailableConnections {
    private Set<Flight> listOfFlights = new HashSet<>();

    Flight konstanty = new Flight("Konstanty", "Warszawa", "Gdańsk", "10.00", "12.00");
    Flight gorniczak = new Flight("Górniczak", "Gdańsk", "Warszawa", "08.00", "09.00");
    Flight wladimir = new Flight("Władimir", "Warszawa", "Białystok", "11.00", "12.00");
    Flight stoliczak = new Flight("Stoliczak", "Białystok", "Warszawa", "11.00", "12.00");
    Flight okrezniak = new Flight("Okręzniak", "Katowice", "Gdańsk", "10.00", "12.00");
    Flight slazak = new Flight("Slazak", "Gdańsk", "Katowice", "08.00", "09.00");
    Flight lukowiak = new Flight("Łukowiak", "Gdańsk", "Białystok", "08.00", "09.00");
    Flight lowiczowiak = new Flight("Łowiczowiak", "Białystok", "Gdańsk", "08.00", "09.00");
    Flight pomorzak = new Flight("Pomorzak", "Białystok", "Katowice", "10.00", "12.00");
    Flight dionizy = new Flight("Dionizy", "Warszawa", "Katowice", "10.00", "12.00");
    Flight alojzy = new Flight("Alojzy", "Katowice", "Warszawa", "10.00", "12.00");

    public Set<Flight> getListOfFlights() {
        listOfFlights.add(konstanty);
        listOfFlights.add(gorniczak);
        listOfFlights.add(wladimir);
        listOfFlights.add(stoliczak);
        listOfFlights.add(okrezniak);
        listOfFlights.add(pomorzak);
        listOfFlights.add(slazak);
        listOfFlights.add(alojzy);
        listOfFlights.add(dionizy);
        listOfFlights.add(lowiczowiak);
        listOfFlights.add(lukowiak);
        return listOfFlights;
    }
}
