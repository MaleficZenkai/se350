package hw4.ManagerFiles;

import hw4.airline.Airline;
import hw4.airport.Airport;
import hw4.flight.Flight;

import java.util.Optional;
import java.util.UUID;

public interface FlightManager {
    public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) throws Exception;
    public Optional<Flight> getFlightByFlightNumber(String flightNumber) throws Exception;
}
