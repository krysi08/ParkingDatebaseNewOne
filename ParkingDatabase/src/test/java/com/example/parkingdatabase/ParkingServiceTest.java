package com.example.parkingdatabase;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParkingServiceTest {

    // Check out to make it work:
    // https://www.baeldung.com/spring-testing-separate-data-source -> You need test repository here
    private final ParkingService parkingService = new ParkingService();

    @Test
    public void shouldAddSingleCar() {
        // given
        Car car = new Car("123", "Corsa", "Opel", Color.WHITE);

        // when
        parkingService.addNewCar(car);

        // then
        List<Car> cars = new ArrayList<>();
        parkingService.listAllCars().forEach(cars::add);
        assertEquals(cars.size(), 1);
        assertEquals(cars.get(0).getColor(), Color.WHITE);
        assertEquals(cars.get(0).getIDname(), "123");
        assertEquals(cars.get(0).getManufacture(), "Opel");
        assertEquals(cars.get(0).getModel(), "Corsa");
    }

    @Test
    public void removeCar() {

        Car car1 = new Car("456", "5", "BMW", Color.BLACK);

        parkingService.removeCar(car1);

        List<Car> cars1 = new ArrayList<>();
        parkingService.listAllCars().forEach(cars1::remove);
        assertEquals(cars1.size(), 0);
        assertEquals(cars1.get(0).getColor(), null);
        assertEquals(cars1.get(0).getIDname(), null);
        assertEquals(cars1.get(0).getManufacture(), null);
        assertEquals(cars1.get(0).getModel(), null);

    }
}
