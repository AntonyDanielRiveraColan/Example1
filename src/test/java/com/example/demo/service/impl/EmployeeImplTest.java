package com.example.demo.service.impl;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeImplTest {

    @InjectMocks
    private EmployeeImpl employeeService;

    @Mock
    private EmployeeRepository2 employeeRepository;

    @Test
    public void getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        given(employeeRepository.findAll()).willReturn(list);
        assertEquals(list, employeeService.getAllEmployee());
    }

    @Test
    public void addEmployee() {
        employeeRepository.save(new Employee());
        employeeService.addEmployee(new Employee());
    }

    @Test
    public void udpdateEmployee() {
        employeeRepository.save(new Employee());
        employeeService.udpdateEmployee(new Employee());
    }

    @Test
    public void deleteEmployee() {
        employeeRepository.findById(1);
        employeeService.deleteEmployee(1);
    }
}