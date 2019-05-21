package com.example.demo.Controller;

import com.example.demo.Model.Department;
import com.example.demo.Model.Employee;
import com.example.demo.Service.DepartmentService;
import com.example.demo.Service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departmentApi/v1")
@Api(tags = "CRUD de Department")
public class DepartmentController {



    @Autowired
    DepartmentService departmentService;

    /** *
     * Usar version de swager 1.5.14
     * swagger anotation
     * swagger model
     * http://localhost:8080/swagger-ui.html#/
     */


    @ApiOperation("Retorna una lista de Department")
    @GetMapping("/read")
    @ResponseStatus(HttpStatus.OK)
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @ApiOperation("Inserta un registro en Department")
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void addDepartment(@RequestBody Department obj) {
        departmentService.addDepartment(obj);
    }

    @ApiOperation("Actualiza un registro en Department")
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void udpdateDepartment(@RequestBody Department obj) {
        departmentService.udpdateDepartment(obj);
    }

    @ApiOperation("Elimina un registro en Department")
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteDepartment(@PathVariable("id") Integer id) {
        departmentService.deleteDepartment(id);
    }
}
