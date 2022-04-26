package hw4.Factories;

import hw4.ExceptionHandlings.NullParameterException;
import hw4.flight.CommercialFlight;
import hw4.flight.PassengerFlight;
import hw4.airline.Airline;
import hw4.airport.Airport;
import hw4.flight.Flight;

public class FlightFactory {
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int passengerCapacity) throws NullParameterException {
        if (type.equals("commercialFlight")) {
            return new CommercialFlight(airline, origin, destination);
        }  else if (type.equals("passengerFlight")) {
            return new PassengerFlight(airline, origin, destination, passengerCapacity);
        } else
            return null;
    }

}
