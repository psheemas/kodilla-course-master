package com.kodilla.good.patterns.exitair;

public class WelcomeScreen {
    public void welcomeScreen() {
        AvailableConnections availableConnections = new AvailableConnections();
        System.out.println("Hello in ExitAir \n");
        System.out.println("List of available flights: \n");
        System.out.println(availableConnections.getListOfFlights());
    }
}
