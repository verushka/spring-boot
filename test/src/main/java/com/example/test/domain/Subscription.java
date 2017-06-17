package com.example.test.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by nicaela on 16/6/2017.
 */
@Document
public class Subscription {

    @Id
    private String id;
    private Date subDate;

    @DBRef
    private Student student;

    @DBRef
    private Teacher teacher;

    public Subscription(String id, Date subDate, Student student, Teacher teacher) {
        this.id = id;
        this.subDate = subDate;
        this.student = student;
        this.teacher = teacher;
    }

    public Subscription(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getSubDate() {
        return subDate;
    }

    public void setSubDate(Date subDate) {
        this.subDate = subDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
