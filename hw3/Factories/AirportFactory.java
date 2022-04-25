package hw3.Factories;

import hw3.ExceptionHandlings.BadParameterException;
import hw3.ExceptionHandlings.NullParameterException;
import hw3.airport.Airport;

import java.util.HashMap;
import java.util.Map;

public class AirportFactory {

    private static Map<String, Airport> airports = new HashMap<>();

    public static Airport getAirport(String airportName) {
        return airports.computeIfAbsent(airportName, (nameOfAirport) -> {
            try {
                return new Airport(nameOfAirport);
            } catch (BadParameterException e) {
                throw new RuntimeException(e);
            } catch (NullParameterException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

