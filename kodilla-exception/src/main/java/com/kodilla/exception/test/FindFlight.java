package com.kodilla.exception.test;
import java.util.HashMap;

 class FlightChecker{
     Flight flight;

     public FlightChecker(Flight flight){
         this.flight = flight;
     }

     public Flight getFlight(){
         return flight;
     }

     public boolean FindFlight(Flight flight) throws RouterNotFoundException{
        HashMap<String,Boolean> flightMap = new HashMap();
        flightMap.put("JNB",true);
        flightMap.put("ZHR",true);
        flightMap.put("WAW",true);
        flightMap.put("GDY",true);
        flightMap.put("DUB",true);
        flightMap.put("LHR",true);

        if(flightMap.get(getFlight().getArrivalAirport()) != null){
            return flightMap.get(getFlight().getArrivalAirport());
        }else{
            throw new RouterNotFoundException("no such flight");
        }

     }
}
