package hw3.travelmanager;

import hw3.Factories.AirportFactory;
import hw3.airline.Airline;
import hw3.Factories.AirlineFactory;
import hw3.airport.Airport;
import hw3.flight.FlightInterface;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

public class TravelManager {

    public static void main(String[] args) throws Exception {
        Airline airline = AirlineFactory.getAirline("United");
        Airport origin = AirportFactory.getAirport("CHI");
        Airport destination = AirportFactory.getAirport("HOU");
        UUID flightNumber = UUID.randomUUID();
        Date departureTime = new Date();


        //CommercialFlight flight = new CommercialFlight(airline, origin, destination, flightNumber, departureTime);

        String flightNum = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination, flightNumber, departureTime);
        String passengerFlightNum = FlightManager.getInstance().createFlight("passengerFlight", airline, origin, destination, flightNumber, departureTime);
        Optional <FlightInterface> flight = FlightManager.getInstance().getFlightbyFlightNumber(flightNum);
        Optional <FlightInterface> passengerCount = FlightManager.getInstance().getFlightbyFlightNumber(passengerFlightNum);
//        System.out.println(flight.get());
//        System.out.println(passengerCount.get());
        System.out.println(String.valueOf(flight.get()).concat(String.valueOf(passengerCount.get())));
    }
}
