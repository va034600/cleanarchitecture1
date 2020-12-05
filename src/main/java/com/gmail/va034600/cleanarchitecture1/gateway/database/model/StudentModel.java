package com.gmail.va034600.cleanarchitecture1.gateway.database.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentModel {
    public StudentModel(){}

    @Id
    private long id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
