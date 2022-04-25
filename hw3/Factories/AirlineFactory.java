package hw3.Factories;

import hw3.ExceptionHandlings.BadParameterException;
import hw3.ExceptionHandlings.NullParameterException;
import hw3.airline.Airline;
import hw3.airport.Airport;

import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {

    private static Map<String, Airline> airlines = new HashMap<>();

    public static Airline getAirline(String airlineName) {
         return airlines.computeIfAbsent(airlineName, (nameOfAirline) -> new Airline(nameOfAirline));
    }
}
