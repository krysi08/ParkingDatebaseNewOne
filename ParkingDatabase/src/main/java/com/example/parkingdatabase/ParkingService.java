package com.example.parkingdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParkingService {

    @Autowired
    private CarRepo carRepo;

    public void addNewCar(Car car) {
        carRepo.save(car);
    }

    public void removeCar(Car car) { carRepo.delete(car);}

}
