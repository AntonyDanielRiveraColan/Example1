package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/employeeApi/v1")
@Api(tags = "CRUD de Employee")
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;


  @ApiOperation("Lista los registros de Employee")
  @GetMapping("/")
  @ResponseStatus(HttpStatus.OK)
  public List<Employee> getAllEmployee() {
    return employeeService.getAllEmployee();
  }

  @ApiOperation("Inserta un registro en Employee")
  @PostMapping("/")
  @ResponseStatus(HttpStatus.CREATED)
  public void addEmployee(@RequestBody Employee obj) {
    employeeService.addEmployee(obj);
  }

  @ApiOperation("Actualiza un registro en Employee")
  @PutMapping("/")
  @ResponseStatus(HttpStatus.OK)
  public void udpdateEmployee(@RequestBody Employee obj) {
    employeeService.udpdateEmployee(obj);
  }

  @ApiOperation("Elimina un registro en Employee")
  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteEmployee(@PathVariable("id") Integer id) {
    employeeService.deleteEmployee(id);
  }

}
