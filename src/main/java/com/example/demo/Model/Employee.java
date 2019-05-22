package com.example.demo.Model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    public Employee(int dniEmp, String nameEmp, double salaryEmp, int phoneEmp, int idDep, boolean boss) {
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
