package com.example.test.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by nicaela on 16/6/2017.
 */
@Document
public class Student {
    @Id
    private String id;
    private String name;
    private String ci;
    private String codSis;

    public Student(String id, String name, String ci, String codSis) {
        this.id = id;
        this.name = name;
        this.ci = ci;
        this.codSis = codSis;
    }

    public Student(){

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

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCodSis() {
        return codSis;
    }

    public void setCodSis(String codSis) {
        this.codSis = codSis;
    }
}
