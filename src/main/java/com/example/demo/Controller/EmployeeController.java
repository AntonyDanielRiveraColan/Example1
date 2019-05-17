package com.example.demo.Controller;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeeApi/v1")
public class EmployeeController {



    @Autowired
    EmployeeService employeeService;


    @GetMapping("/read")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody Employee obj) {
        employeeService.addEmployee(obj);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void udpdateEmployee(@RequestBody Employee obj) {
        employeeService.udpdateEmployee(obj);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
    }

}
