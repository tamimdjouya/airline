package airport.airline.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Airplane {
    @Id
    @GeneratedValue
    private int id;
    private int amountOfTank;
    private String name;
    private int flightNumber;
    private String destination;
    private String departure;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmountOfTank() {
        return amountOfTank;
    }

    public void setAmountOfTank(int amountOfTank) {
        this.amountOfTank = amountOfTank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlightnumber() {
        return flightNumber;
    }

    public void setFlightnumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }
}
