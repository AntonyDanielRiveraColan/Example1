package com.example.demo.service.impl;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository2;
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
public class DepartmentImplTest {

    @InjectMocks
    private DepartmentImpl departmentService;

    @Mock
    private DepartmentRepository2 departmentRepository;

    @Test
    public void getAllDepartment() {
        List<Department> list = new ArrayList<>();
        given(departmentRepository.findAll()).willReturn(list);
        assertEquals(list, departmentService.getAllDepartment());
    }

    @Test
    public void addDepartment() {
        departmentRepository.save(new Department());
        departmentService.addDepartment(new Department());
    }

    @Test
    public void udpdateDepartment() {
        departmentRepository.save(new Department());
        departmentService.udpdateDepartment(new Department());
    }

    @Test
    public void deleteDepartment() {

        departmentRepository.findById(1);
        departmentService.deleteDepartment(1);

    }
}