package hw3.flight;

import hw3.ExceptionHandlings.NullParameterException;
import hw3.airline.Airline;
import hw3.airport.Airport;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;


public class CommercialFlight implements FlightInterface {
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private UUID flightNumber;
    private Date departureTime;


    public CommercialFlight(Airline airline, Airport origin, Airport destination, UUID flightNumber, Date departureTime) throws NullParameterException {
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.flightNumber = UUID.randomUUID();
        this.departureTime = new Date();
    }

    public String getFlightNumber() {
        return flightNumber.toString();
    }

    public void setFlightNumber() {
        this.flightNumber = UUID.randomUUID();
    }

    public String getDepartureTime() {
        return departureTime.toString();
    }

    public void setDepartureTime() {
        this.departureTime = new Date();
    }

    public String getAirline() {
        return airline.toString();
    }

    public void setAirline(Airline airline) throws NullParameterException {
        if (airline == null) {
            throw new NullParameterException("Airline cannot be null");
        }
        this.airline = airline;
    }

    public String getOrigin() {
        return origin.toString();
    }

    public void setOrigin(Airport origin) throws NullParameterException {
        if (origin == null) {
            throw new NullParameterException("Origin cannot be null");
        }
        this.origin = origin;
    }

    public String getDestination() {
        return destination.toString();
    }

    public void setDestination(Airport destination) throws NullParameterException {
        if (destination == null) {
            throw new NullParameterException("Destination cannot be null");
        }
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommercialFlight flight = (CommercialFlight) o;
        return airline.equals(flight.airline) && origin.equals(flight.origin) && destination.equals(flight.destination) && flightNumber.equals(flight.flightNumber) && departureTime.equals(flight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origin, destination, flightNumber, departureTime);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + airline +
                ", origin=" + origin +
                ", destination=" + destination +
                ", flightNumber=" + flightNumber +
                ", departureTime=" + departureTime +
                '}';
    }
}












