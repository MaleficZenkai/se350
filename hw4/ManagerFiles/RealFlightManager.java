package hw4.ManagerFiles;

import hw4.ExceptionHandlings.NullParameterException;
import hw4.airline.Airline;
import hw4.airport.Airport;
import hw4.flight.Flight;
import hw4.Factories.FlightFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class RealFlightManager implements FlightManager {

    private static RealFlightManager ourInstance;
    private static List<Flight> flights;

    public static RealFlightManager getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new RealFlightManager();
        return ourInstance;
    }

    private RealFlightManager() {
        flights = new ArrayList<Flight>();
    }

    public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) throws NullParameterException {
        Flight flight = FlightFactory.createFlight(type, airline, origin, destination, passengerCapacity);
        flights.add(flight);

        return flight.getFlightNumber();
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return Optional.of(flight);
            }
        }
        return null;
    }
}
