package com.example.demo.Service;

import com.example.demo.Model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public void addEmployee(Employee obj);

    public void udpdateEmployee(Employee obj);

    public void deleteEmployee(Integer id);
}
