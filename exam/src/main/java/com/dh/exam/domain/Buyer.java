package com.dh.exam.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by nicaela on 17/6/2017.
 */
@Document
public class Buyer {
    @Id
    private String id;
    private String name;
    private String ci;
    private String profession;
    private long cel;

    public Buyer(String id, String name, String ci, String profession, long cel) {
        this.id = id;
        this.name = name;
        this.ci = ci;
        this.profession = profession;
        this.cel = cel;
    }

    public Buyer(){

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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public long getCel() {
        return cel;
    }

    public void setCel(long cel) {
        this.cel = cel;
    }
}
