package com.dh.exam.service;

import com.dh.exam.domain.Car;
import com.dh.exam.repository.CarRepository;
import com.dh.exam.web.CarController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nicaela on 17/6/2017.
 */
@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public Car getCar(String id){
        return carRepository.findOne(id);
    }

    public void addNewCar(CarController.CarRequestDTO carRequestDTO){
        Car car = new Car();
        car.setBrand(carRequestDTO.getBrand());
        car.setColor(carRequestDTO.getColor());
        car.setModel(carRequestDTO.getModel());
        car.setYear(carRequestDTO.getYear());
        car.setImage(carRequestDTO.getImage());
        carRepository.save(car);
    }

    public void deleteCar(String id){
        carRepository.delete(id);
    }

    public Car updateCar(String id, CarController.CarRequestDTO carRequestDTO){
        Car car = new Car();
        car.setBrand(carRequestDTO.getBrand());
        car.setColor(carRequestDTO.getColor());
        car.setImage(carRequestDTO.getImage());
        car.setModel(carRequestDTO.getModel());
        car.setYear(carRequestDTO.getYear());

        car.setId(id);

        carRepository.save(car);
        return car;

    }

}
