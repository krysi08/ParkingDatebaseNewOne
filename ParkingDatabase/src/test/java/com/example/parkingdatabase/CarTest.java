package com.example.parkingdatabase;


import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
/*
@ContextConfiguration(
     classes = {CarJpaConfig.class}
        loader = AnnotationConfigContextLoader.class
)
@Transactional

public class CarTest {
@Resource
    private CarRepo carRepo;
/*
@Test
    public void getCar_save_and_remove()
{
    Car car = new Car(1,"BMW");
    carRepo.save(car);

    Car car2 = carRepo.findOne(1);
    assertEquals("BMW",car2.getModel());

 */



