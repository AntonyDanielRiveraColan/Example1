package com.example.demo.service.impl;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository2;
import com.example.demo.service.DepartmentService;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service /** Anotación que debe de ser empleada para la capa de servicios y
            logica de negocio. */

@Transactional /**  Define el alcance de una sola transacción de base de datos.
                    Esta ocurre dentro del alcance de un contexto de persistencia .*/

public class DepartmentImpl  implements DepartmentService {

  /**Aqui se implementan los metodos declarados en la interface Service.*/

  @Autowired
  DepartmentRepository2 departmentRepository;

  @Override
  public List<Department> getAllDepartment() {
    return departmentRepository.findAll();
  }

  @Override
  public void addDepartment(Department obj) {
    departmentRepository.save(obj);

  }

  @Override
  public void udpdateDepartment(Department obj) {
    departmentRepository.save(obj);
  }

  @Override
  public void deleteDepartment(Integer id) {
    departmentRepository.deleteById(id);
  }
}
