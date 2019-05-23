package com.example.demo.service.impl;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository2;
import com.example.demo.service.DepartmentService;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
@Transactional
public class DepartmentImpl  implements DepartmentService {

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
