package hw4.flight;

import hw4.airline.Airline;
import hw4.airport.Airport;
import hw4.ExceptionHandlings.NullParameterException;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class CommercialFlight extends Flight {

    public CommercialFlight(Airline airline, Airport origin, Airport destination) throws NullParameterException {
        super(airline, origin, destination);
    }
}










