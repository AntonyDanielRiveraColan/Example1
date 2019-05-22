package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dep")
    private int idDep;

    @Column(name = "name_dep")
    private String nameDep;

    @Column(name = "ubi_dep")
    private String locationDep;

    public Department(String nameDep, String locationDep) {
        this.nameDep = nameDep;
        this.locationDep = locationDep;
    }

    public Department() {
    }
}
