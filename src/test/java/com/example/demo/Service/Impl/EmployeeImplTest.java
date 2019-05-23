package com.example.demo.Service.Impl;

import com.example.demo.Model.Department;
import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        given(employeeRepository.findById(1)).willReturn(Optional.of(new Employee()));
        employeeService.deleteEmployee(1);
    }
}