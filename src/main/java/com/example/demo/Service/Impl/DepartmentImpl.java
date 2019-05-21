package com.example.demo.Service.Impl;

import com.example.demo.Model.Department;
import com.example.demo.Repository.DepartmentRepository2;
import com.example.demo.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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
