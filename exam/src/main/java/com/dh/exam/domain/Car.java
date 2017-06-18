package com.dh.exam.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by nicaela on 17/6/2017.
 */
@Document
public class Car {
    @Id
    private String id;
    private String brand;
    private long year;
    private String model;
    private String color;
    private String image;

    public Car(String id, String brand, long year, String model, String color, String image) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.color = color;
        this.image = image;
    }

    public Car(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
