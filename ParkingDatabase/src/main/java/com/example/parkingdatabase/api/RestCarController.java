package com.example.parkingdatabase.api;

import com.example.parkingdatabase.dao.entity.Car;
import com.example.parkingdatabase.manager.ParkingServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping("/api/car")
public class RestCarController {


    private ParkingServiceManager listCars;

    @Autowired
    public RestCarController(ParkingServiceManager listCars) {
        this.listCars = listCars;
    }

    @GetMapping("/all")
    public Iterable<Car> getAll() {
        return listCars.findAll();
    }

    @GetMapping
    public Optional<Car> getById(@RequestParam Long id) {
        return listCars.findById(id);
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return listCars.save(car);
    }

    @PutMapping
    public Car updateCar(@RequestBody Car car) {
        return listCars.save(car);
    }

    @DeleteMapping
    public void deleteCar(@RequestBody Long id) {
        listCars.deletebyId(id);
    }
}
