package com.kodilla.good.patterns.exitair;

public class ExitAirMain {
    public static void main(String[] args) {
        FlightsGoogle flightsGoogle = new FlightsGoogle();
        WelcomeScreen welcomeScreen = new WelcomeScreen();
        welcomeScreen.welcomeScreen();

        flightsGoogle.flightGoogle();
        flightsGoogle.findFlightFrom("Warszawa");
        flightsGoogle.findFlightsTo("Białystok");

    }
}
