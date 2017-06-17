package com.example.test.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by nicaela on 16/6/2017.
 */
@Document
public class Room {

    @Id
    private String id;

    private String code;
    private int capacity;

    public Room(String id, String code, int capacity) {
        this.id = id;
        this.code = code;
        this.capacity = capacity;
    }
    public Room(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
