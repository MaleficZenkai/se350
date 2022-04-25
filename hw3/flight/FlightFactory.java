package hw3.flight;

import hw3.ExceptionHandlings.NullParameterException;
import hw3.airline.Airline;
import hw3.airport.Airport;

import java.util.Date;
import java.util.UUID;

public class FlightFactory {
    private FlightFactory() {

    }

    public static FlightInterface createFlight(String type, Airline airline, Airport origin, Airport destination, UUID flightNumber, Date departureTime) throws NullParameterException, HW1.ExceptionHandlings.NullParameterException {
        if (type.equals("commercialFlight"))
            return new CommercialFlight(airline, origin, destination, flightNumber, departureTime);
        else if (type.equals("passengerFlight"))
            return new PassengerFlight(airline, origin, destination, flightNumber, departureTime);
        else
            return null;
    }
}
