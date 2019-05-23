package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;



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
