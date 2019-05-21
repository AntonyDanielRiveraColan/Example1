package com.example.demo.Model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private int idEmp;

    @Column(name = "dniEmp ")
    private int dniEmp;

    @Column(name = "nameEmp ")
    private String nameEmp;

    @Column(name = "salaryEmp ")
    private double salaryEmp;

    @Column(name = "phoneEmp ")
    private int phoneEmp;

    @Column(name = "idDep ")
    private int idDep;

    @Column(name = "boss ")
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
