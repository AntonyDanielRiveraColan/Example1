package com.example.demo.Service;

import com.example.demo.Model.Department;
import com.example.demo.Model.Employee;

import java.util.List;

public interface DepartmentService {

    public List<Department> getAllDepartment();

    public void addDepartment(Department obj);

    public void udpdateDepartment(Department obj);

    public void deleteDepartment(Integer id);


}
