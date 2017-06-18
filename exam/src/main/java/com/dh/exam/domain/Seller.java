package com.dh.exam.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by nicaela on 17/6/2017.
 */
@Document
public class Seller {
    @Id
    private String id;
    private String name;
    private long age;
    private String ci;
    private long numCarSold = 0;

    public Seller(String id, String name, long age, String ci, long numCarSold) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ci = ci;
        this.numCarSold = numCarSold;
    }
    public Seller(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public long getNumCarSold() {
        return numCarSold;
    }

    public void setNumCarSold(long numCarSold) {
        this.numCarSold = numCarSold;
    }
}
