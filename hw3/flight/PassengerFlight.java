package hw3.flight;

import HW1.ExceptionHandlings.NullParameterException;
import hw3.airline.Airline;
import hw3.airport.Airport;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class PassengerFlight extends CommercialFlight {

    private int passengerCapacity;

    public PassengerFlight(Airline airline, Airport origin, Airport destination, UUID flightNumber, Date departureTime) throws hw3.ExceptionHandlings.NullParameterException {
        super(airline, origin, destination, flightNumber, departureTime);
        this.passengerCapacity = passengerCapacity;
    }


    public int getPassengerCapacity() {
            return passengerCapacity;
        }

        public void setPassengerCapacity(int passengerCapacity) throws NullParameterException {
            if (passengerCapacity <= 0)
                throw new NullParameterException("The passenger capacity cannot be 0 or less");
            this.passengerCapacity = passengerCapacity;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerFlight that = (PassengerFlight) o;
        return passengerCapacity == that.passengerCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerCapacity);
    }

    @Override
    public String toString() {
        return "PassengerFlight{" +
                "passengerCapacity=" + passengerCapacity +
                '}';
    }
}
