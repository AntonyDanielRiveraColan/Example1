package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue
    private int idDep;


    @Column(name = "nameDep ")
    private String nameDep;

    @Column(name = "locationDep ")
    private String locationDep;

    public Department(String nameDep, String locationDep) {
        this.nameDep = nameDep;
        this.locationDep = locationDep;
    }

    public Department() {
    }
}
