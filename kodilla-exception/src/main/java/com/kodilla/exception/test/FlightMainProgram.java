package com.kodilla.exception.test;

public class FlightMainProgram{
    public static void main (String[] args){
        Flight wawToLhr = new Flight("WAW","LHR");
        FlightChecker flightChecker = new FlightChecker(wawToLhr);

        try {
            System.out.println("Can You fly to: " + wawToLhr.getArrivalAirport() +" - " + flightChecker.FindFlight(wawToLhr));
        }catch(RouterNotFoundException e){
            System.out.println("Try with different destination airport!");
        }
        System.out.println("Thanks!");


    }
}
