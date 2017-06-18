package com.dh.exam.web;

import com.dh.exam.domain.Car;
import com.dh.exam.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nicaela on 17/6/2017.
 */
@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Car getCar(@PathVariable String id){
        return  carService.getCar(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewCar(@RequestBody CarRequestDTO carRequestDTO){
        carService.addNewCar(carRequestDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable String id){
        carService.deleteCar(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Car updateCar(@PathVariable String id, CarRequestDTO carRequestDTO){
        return carService.updateCar(id, carRequestDTO);
    }

    public static class CarRequestDTO{
        private String brand;
        private long year;
        private String model;
        private String color;
        private String image;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public long getYear() {
            return year;
        }

        public void setYear(long year) {
            this.year = year;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
