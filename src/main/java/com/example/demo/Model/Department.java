package com.example.demo.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Department {

    public Department(String nameDep, String locationDep) {
        this.nameDep = nameDep;
        this.locationDep = locationDep;
    }

    public Department() {
    }

    @Id
    @GeneratedValue
    private int idDep;


    @Column(name = "nameDep ")
    private String nameDep;

    @Column(name = "locationDep ")
    private String locationDep;


}
