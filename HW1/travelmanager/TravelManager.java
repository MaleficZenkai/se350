package HW1.travelmanager;

import HW1.ExceptionHandlings.NullParameterException;
import HW1.ExceptionHandlings.BadParameterException;
import HW1.airport.Airport;
import HW1.airline.Airline;
import HW1.flight.Flight;

import java.util.Date;
import java.util.UUID;

public class TravelManager {

    public static void main(String[] args) throws BadParameterException, NullParameterException {
        Airline airline = new Airline("United");
        Airport origin = new Airport("CHI");
        Airport destination = new Airport("HOU");
        UUID flightNumber = UUID.randomUUID();
        Date departureTime = new Date();


        Flight flight = new Flight(airline, origin, destination, flightNumber, departureTime);

        System.out.println(flight);
    }
}
