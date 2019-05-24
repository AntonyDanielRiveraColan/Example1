package com.example.demo.service;

import com.example.demo.model.Department;

import java.util.List;

public interface DepartmentService {

  /**Aqui se declaran los metodos para su posterior implementacion.*/

  public List<Department> getAllDepartment();


  public void addDepartment(Department obj);


  public void udpdateDepartment(Department obj);


  public void deleteDepartment(Integer id);

}
