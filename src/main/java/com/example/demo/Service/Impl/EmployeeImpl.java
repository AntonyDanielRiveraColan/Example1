package com.example.demo.Service.Impl;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository2;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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
