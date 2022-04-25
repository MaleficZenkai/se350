package hw2.flight;

import hw2.ExceptionHandlings.NullParameterException;
import hw2.airline.Airline;
import hw2.airport.Airport;
import hw2.flight.CommercialFlight;

import java.util.Date;
import java.util.UUID;

public class FlightFactory {
    private FlightFactory() {

    }

    public static FlightInterface createFlight(String type, Airline airline, Airport origin, Airport destination, UUID flightNumber, Date departureTime) throws NullParameterException {
        if (type.equals("commercialFlight"))
            return new CommercialFlight(airline, origin, destination, flightNumber, departureTime);
        else
            return null;
    }
}
