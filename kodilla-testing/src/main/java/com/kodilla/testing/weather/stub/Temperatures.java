package com.kodilla.testing.weather.stub;
import java.util.*;

public interface Temperatures {
    //first element of the map is an identifier of weather station
    //second element of the map is a temperature is Celsius degrees

    HashMap<Integer,Double> getTemperatures();
}
