package com.dh.exam.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by nicaela on 17/6/2017.
 */
@Document
public class RegistryCarSold {
    @Id
    private String id;
    private String sold_date;
    @DBRef
    private Buyer buyer;
    @DBRef
    private Seller seller;
    @DBRef
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public RegistryCarSold(String id, String sold_date, Buyer buyer, Seller seller, Car car) {
        this.id = id;
        this.sold_date = sold_date;
        this.buyer = buyer;
        this.seller = seller;
        this.car = car;
    }

    public RegistryCarSold(){

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSold_date() {
        return sold_date;
    }

    public void setSold_date(String sold_date) {
        this.sold_date = sold_date;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
