package com.example.parkingdatabase;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping

public class RestCarController {

    private List<Car> listCars;

    public RestCarController() {
        listCars = new ArrayList<Car>();
        listCars.add(new Car("1A","Opel","Insignia",Color.BLACK));
        listCars.add(new Car("1B","BMW","5",Color.WHITE));
    }

    @GetMapping
    public List<Car> getAll() {
    return listCars;
    }

    @GetMapping
    public Car getById(@RequestParam int id) {
        Optional<Car> first = listCars.stream().filter(c -> c.getId() == id).findFirst();
        return first.get();
    }

    @PostMapping
 public boolean addCar(@RequestBody Car car) {
        return listCars.add(car);
    }

    @PutMapping
    public boolean updateCar(@RequestBody Car car) {
        return listCars.add(car);
    }

    @DeleteMapping
    public boolean deleteCar(@RequestBody int id) {
        return listCars.removeIf(c -> c.getId() == id);
    }
}
