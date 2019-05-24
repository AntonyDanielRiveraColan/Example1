package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;



@Entity
@Data /** Esta notacion crea los get,set,ToString,EqualsAndHashCode */
@Table(name = "department") /**Para indicarle a la clase con que tabla se comunicara */
public class Department {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)/**Esta anotacion realiza el autoincremento*/
  @Column(name = "id_dep")/**Para indicarle el campo con que se comunicara dentro de la tabla*/
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
