package hw4.Factories;

import hw4.ExceptionHandlings.BadParameterException;
import hw4.ExceptionHandlings.NullParameterException;
import hw4.airline.Airline;
import hw4.airport.Airport;

import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {

    private static Map<String, Airline> airlines = new HashMap<>();

    public static Airline getAirline(String airlineName) {
        return airlines.computeIfAbsent(airlineName, (nameOfAirline) -> new Airline(nameOfAirline));
    }
}
