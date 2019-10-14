package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car(2013, "Honda", "Civic");
        repository.save(car);

        car = new Car(2020, "Mercedes Benz", "M class");
        repository.save(car);

        car = new Car (2012, "Toyota", "Camry");
        repository.save(car);
    }

}
