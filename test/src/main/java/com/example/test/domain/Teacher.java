package com.example.test.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by nicaela on 16/6/2017.
 */
@Document
public class Teacher {

    @Id
    private  String id;
    private  String name;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Teacher(){

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
}
