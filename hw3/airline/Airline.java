package hw3.airline;

import hw3.ExceptionHandlings.BadParameterException;
import hw3.ExceptionHandlings.NullParameterException;

import java.util.Objects;

public class Airline {

    private String name;

    public Airline(String name) {

        this.name = name;
    }

    private String getName() {

        return name;
    }

    // Changed getter and setter from public to private to make sure it is immutable

    private void setName(String name) throws NullParameterException, BadParameterException {
        if (name == null) {
            throw new NullParameterException("This value cannot be null");
        }
        if (name.length() < 8 || name.length() > 0) {
            throw new BadParameterException("Name must be less than 8 characters");
        }
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return name.equals(airline.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                '}';
    }
}
