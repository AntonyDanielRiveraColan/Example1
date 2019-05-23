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
@Table(name = "employee")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_emp")
  private int idEmp;

  @Column(name = "dni_emp")
  private int dniEmp;

  @Column(name = "name_emp")
  private String nameEmp;

  @Column(name = "salary")
  private double salaryEmp;

  @Column(name = "phone_emp")
  private int phoneEmp;

  @Column(name = "id_dep")
  private int idDep;

  @Column(name = "boss_emp")
  private boolean boss;

  /**
  * Este es un constructor con todos los paramentros.
  * @param dniEmp ingreso de dni de empleado
  * @param nameEmp nombre del empleado
  * @param salaryEmp salario del empleado
  * @param phoneEmp telefono del empleado
  * @param idDep identificador de departamento del empleado
  * @param boss jefe del empleado
  */

  public Employee(int dniEmp, String nameEmp, double salaryEmp,
      int phoneEmp, int idDep, boolean boss) {
    this.dniEmp = dniEmp;
    this.nameEmp = nameEmp;
    this.salaryEmp = salaryEmp;
    this.phoneEmp = phoneEmp;
    this.idDep = idDep;
    this.boss = boss;
  }

  public Employee() {
  }
}
