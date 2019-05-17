package com.example.demo.Controller;

import com.example.demo.Model.Department;
import com.example.demo.Model.Employee;
import com.example.demo.Service.DepartmentService;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departmentApi/v1")
public class DepartmentController {



    @Autowired
    DepartmentService departmentService;


    @GetMapping("/read")
    @ResponseStatus(HttpStatus.OK)
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void addDepartment(@RequestBody Department obj) {
        departmentService.addDepartment(obj);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void udpdateDepartment(@RequestBody Department obj) {
        departmentService.udpdateDepartment(obj);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteDepartment(@PathVariable("id") Integer id) {
        departmentService.deleteDepartment(id);
    }
}
