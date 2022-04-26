/*
 I struggled a lot on homework 3 and my final product ended up being incorrect in some regards,
 so I used your Homework 3 solutions as a baseline for some of the classes that I couldn't quite complete properly
 so that I could complete Homework 4
 */

package hw4.ManagerFiles;

import hw4.Factories.AirlineFactory;
import hw4.airline.Airline;
import hw4.airport.Airport;
import hw4.Factories.AirportFactory;
import hw4.flight.Flight;

import java.util.Optional;

public class TravelManager {

    public static void main(String[] args) throws Exception {
        FlightManager flightManagerProxy = new ProxyFlightManager();

        Airline airline = AirlineFactory.getAirline("United");
        Airport origin = AirportFactory.getAirport("CHI");
        Airport destination = AirportFactory.getAirport("HOU");

 //     CommercialFlight flight = new CommercialFlight(airline, origin, destination, flightNumber, departureTime);

//      String flightNum = hw4.travelmanager.FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination, flightNumber, departureTime);
//      String passengerFlightNum = hw4.travelmanager.FlightManager.getInstance().createFlight("passengerFlight", airline, origin, destination, flightNumber, departureTime);
        String flightNumber = flightManagerProxy.createFlight("commercialFlight", airline, origin, destination, 0);
        String passengerFlightNum = flightManagerProxy.createFlight("passengerFlight", airline, origin, destination, 100);

//      Optional <FlightInterface> flight = hw4.travelmanager.FlightManager.getInstance().getFlightbyFlightNumber(flightNum);
//      Optional <FlightInterface> passengerCount = hw4.travelmanager.FlightManager.getInstance().getFlightbyFlightNumber(passengerFlightNum);
        Optional<Flight> flight = flightManagerProxy.getFlightByFlightNumber(flightNumber);
        Optional<Flight> passengerFlight2 = flightManagerProxy.getFlightByFlightNumber(passengerFlightNum);

//      System.out.println(flight.get());
//      System.out.println(passengerCount.get());
        System.out.println(flight.get());
        System.out.println(passengerFlight2.get());

    }

}
