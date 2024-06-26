package com.example.parkingdatabase.manager;

import com.example.parkingdatabase.Color;
import com.example.parkingdatabase.dao.entity.Car;
import com.example.parkingdatabase.dao.entity.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParkingService {

    @Autowired
    private CarRepo carRepo;

    public void addNewCar() {

        Car car = new Car("ABC23409","Opel","Astra", Color.BLACK);
        Car car2 = new Car("YFH23409", "Renault", "5W", Color.RED);
        Car car3 = new Car("OFC23409", "Peugeot", "206", Color.WHITE);

        carRepo.save(car);
        carRepo.save(car2);
        carRepo.save(car3);



        Iterable<Car> all = carRepo.findAll();
        all.forEach(System.out::println);
    }

    public void addNewCar(Car car) {
        carRepo.save(car);
    }

    public void removeCar(Car car1) {
        Car car = new Car("ABC23409", "Opel", "Astra", Color.BLACK);
        carRepo.delete(car);

        Iterable<Car> all = carRepo.findAll();
        all.forEach(System.out::println);
    }

    public Iterable<Car> listAllCars() {
        return carRepo.findAll();
    }

}