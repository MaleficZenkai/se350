package HW1.airport;

import java.util.Objects;
import HW1.ExceptionHandlings.NullParameterException;
import HW1.ExceptionHandlings.BadParameterException;

public class Airport {

    private String name;

    public Airport(String name) throws BadParameterException, NullParameterException {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NullParameterException, BadParameterException {
        if (name == null) {
            throw new NullParameterException("This value cannot be null");
        }
        if (name.length() != 3) {
            throw new BadParameterException("Name is the incorrect length");
        }
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return name.equals(airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                '}';
    }
}
