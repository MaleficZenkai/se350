package hw2.travelmanager;

import hw2.ExceptionHandlings.NullParameterException;
import hw2.airline.Airline;
import hw2.airport.Airport;
import hw2.flight.FlightInterface;
import hw2.flight.FlightFactory;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Optional;

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

    public static String createFlight(String type, Airline airline, Airport origin, Airport destination, UUID flightNumber, Date departureTime) throws NullParameterException {
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

