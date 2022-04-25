package hw2.travelmanager;

import hw2.ExceptionHandlings.BadParameterException;
import hw2.ExceptionHandlings.NullParameterException;
import hw2.airline.Airline;
import hw2.airport.Airport;
import hw2.flight.CommercialFlight;
import hw2.flight.FlightInterface;

import java.util.Date;
import java.util.UUID;
import java.util.Optional;

public class TravelManager {

    public static void main(String[] args) throws Exception {
        Airline airline = new Airline("United");
        Airport origin = new Airport("CHI");
        Airport destination = new Airport("HOU");
        UUID flightNumber = UUID.randomUUID();
        Date departureTime = new Date();


        //CommercialFlight flight = new CommercialFlight(airline, origin, destination, flightNumber, departureTime);

        String flightNum = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination, flightNumber, departureTime);

        Optional <FlightInterface> flight = FlightManager.getInstance().getFlightbyFlightNumber(flightNum);


        System.out.println(flight.get());
    }
}
