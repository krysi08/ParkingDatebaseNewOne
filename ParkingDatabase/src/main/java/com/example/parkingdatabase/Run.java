package com.example.parkingdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Run {

    private CarRepo carRepo;
    @Autowired
    public Run(CarRepo carRepo) {
        this.carRepo = carRepo;
    }



    public void addNewCar() {

        Car car = new Car("ABC23409","Opel","Astra",Color.BLACK);
        Car car2 = new Car("YFH23409", "Renault", "5W", Color.RED);
        Car car3 = new Car("OFC23409", "Peugeot", "206", Color.WHITE);

        carRepo.save(car);
        carRepo.save(car2);
        carRepo.save(car3);



    Iterable<Car> all = carRepo.findAll();
    all.forEach(System.out::println);
    }

    public void removeCar() {
        Car car = new Car("ABC23409", "Opel", "Astra", Color.BLACK);
        carRepo.delete(car);

        Iterable<Car> all = carRepo.findAll();
        all.forEach(System.out::println);
    }

}
