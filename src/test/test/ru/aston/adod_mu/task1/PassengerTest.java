package ru.aston.adod_mu.task1;

import org.junit.Test;
import ru.aston.odod_mu.task1.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger = new Passenger(20000, "BMW");
    @Test
    public void ToStringTest(){
        assertEquals("Passenger car: BMW, Price: 20000", this.passenger.toString());
    }
}
