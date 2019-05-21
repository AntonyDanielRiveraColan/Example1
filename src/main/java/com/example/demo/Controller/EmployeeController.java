package com.example.demo.Controller;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeeApi/v1")
@Api(tags = "CRUD de Employee")
public class EmployeeController {



    @Autowired
    EmployeeService employeeService;


    @ApiOperation("Lista los registros de Employee")
    @GetMapping("/read")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @ApiOperation("Inserta un registro en Employee")
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody Employee obj) {
        employeeService.addEmployee(obj);
    }

    @ApiOperation("Actualiza un registro en Employee")
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void udpdateEmployee(@RequestBody Employee obj) {
        employeeService.udpdateEmployee(obj);
    }

    @ApiOperation("Elimina un registro en Employee")
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEmployee(@PathVariable("id") Integer id) {
        employeeService.deleteEmployee(id);
    }

}
