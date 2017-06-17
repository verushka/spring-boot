package com.example.test.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by nicaela on 16/6/2017.
 */
@Document
public class Subject {
    @Id
    private String id;

    private String code;
    private String name;

    public Subject(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Subject(){

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
