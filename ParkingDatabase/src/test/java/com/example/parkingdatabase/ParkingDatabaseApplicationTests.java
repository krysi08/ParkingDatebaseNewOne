package com.example.parkingdatabase;

import com.jayway.jsonpath.internal.function.sequence.Index;
import org.assertj.core.internal.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ParkingDatabaseApplicationTests {}

    public class AssertjTest {}

    @Test
    void test_list_addingcars_works() {


        Car car = new Car("ABC23409","Opel","Astra",Color.BLACK);
        Car car2 = new Car("YFH23409", "Renault", "5W", Color.RED);
        Car car3 = new Car("OFC23409", "Peugeot", "206", Color.WHITE);

        carRepo.save(car);
        carRepo.save(car2);
        carRepo.save(car3);


        Iterable<Car> all = carRepo.findAll();
        all.forEach(System.out::println);

    }

    @Test
    void test_list_removingcars_works() {

        Car car = new Car("ABC23409", "Opel", "Astra", Color.BLACK);
        carRepo.delete(car);

        Iterable<Car> all = carRepo.findAll();
        all.forEach(System.out::println);

    }

    @Test
    void test_list_done() {

        List<String> list = Arrays.asList("RTE43521", "BMW", "M5");

        assertThat(list)
                .hasSize(3)
                .contains("BMW","M5")
                .contains("RTE435521", Index.atIndex(0))
                .contains("BMW", Index.atIndex(1))
                .contains("M5", Index.atIndex(2))
                .doesNotContain("ABC34532")
    }

//    @Test
//    @DisplayName("Should make a list with all cars on the parking")
//
//
//    ParkingDatabaseApplicationTests test = new ParkingDatabaseApplicationTests();


}
