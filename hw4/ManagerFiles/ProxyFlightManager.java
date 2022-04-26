package hw4.ManagerFiles;

import hw4.airline.Airline;
import hw4.airport.Airport;
import hw4.flight.Flight;


import java.util.Optional;

public final class ProxyFlightManager implements FlightManager {


    public String createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) throws Exception {
        System.out.println("A flight is being created");
        return RealFlightManager.getInstance().createFlight(type,  airline, origin, destination, passengerCapacity);
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) throws Exception {
        System.out.println("Flight Number: " + flightNumber);
        return RealFlightManager.getInstance().getFlightByFlightNumber(flightNumber);
    }
}
