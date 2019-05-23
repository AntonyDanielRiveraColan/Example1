package com.example.demo.service.impl;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository2;
import com.example.demo.service.EmployeeService;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeImpl implements EmployeeService {

  @Autowired
  EmployeeRepository2 employeeRepository;

  @Override
  public List<Employee> getAllEmployee() {
    return employeeRepository.findAll();
  }

  @Override
  public void addEmployee(Employee obj) {
    employeeRepository.save(obj);
  }

  @Override
   public void udpdateEmployee(Employee obj) {
    employeeRepository.save(obj);
  }

  @Override
  public void deleteEmployee(Integer id) {
    employeeRepository.deleteById(id);
  }
}
