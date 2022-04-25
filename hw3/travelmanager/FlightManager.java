package hw3.travelmanager;

import hw3.ExceptionHandlings.NullParameterException;
import hw3.airline.Airline;
import hw3.airport.Airport;
import hw3.flight.FlightFactory;
import hw3.flight.FlightInterface;

import java.util.*;

public final class FlightManager {

    private static FlightManager ourInstance;

    private static List<FlightInterface> flights;

    public static FlightManager getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new FlightManager();

        return ourInstance;
    }

    private FlightManager() {
        flights = new ArrayList<FlightInterface>();
    }

    public static String createFlight(String type, Airline airline, Airport origin, Airport destination, UUID flightNumber, Date departureTime) throws NullParameterException, HW1.ExceptionHandlings.NullParameterException {
        FlightInterface flight = FlightFactory.createFlight(type, airline, origin, destination, flightNumber, departureTime);
        flights.add(flight);
        return flight.getFlightNumber();
    }

    public Optional<FlightInterface> getFlightbyFlightNumber(String flightNumber) {

        for (FlightInterface flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return Optional.of(flight);
            }
        }
        return null;
    }
}

