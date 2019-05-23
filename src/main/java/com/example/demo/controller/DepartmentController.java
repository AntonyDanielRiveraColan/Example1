package com.example.demo.controller;

import com.example.demo.model.Department;

import com.example.demo.service.DepartmentService;
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
@RequestMapping("/departmentApi/v1")
/**
 * Usar version de swager 1.5.14 swagger anotation swagger model http://localhost:8080/swagger-ui.html#/
 * @Api es la notacion que se utiliza para nombrar en swagger a una clase controlador
 */
@Api(tags = "CRUD de Department")
public class DepartmentController {

  /**
   * Lo que hace un autowired es buscar un objeto manejado (beans) que implementen determinada
   * interfaz para hacer referencia a él. De esta manera no es neceario crear una instancia nueva
   * del objeto cada vez que se necesite la funcionalidad de determinada clase
   */
  @Autowired
  DepartmentService departmentService;

  /**
   * Metodo para listar departments. @ApiOperation es la notacion que se utiliza para nombrar
   * en swagger a una metodo que realiza una operacion
   */

  @ApiOperation("Retorna una lista de Department")
  @GetMapping("/")
  @ResponseStatus(HttpStatus.OK)
  public List<Department> getAllDepartment() {
    return departmentService.getAllDepartment();
  }

  @ApiOperation("Inserta un registro en Department")
  @PostMapping("/")
  @ResponseStatus(HttpStatus.CREATED)
  public void addDepartment(@RequestBody Department obj) {
    departmentService.addDepartment(obj);
  }

  @ApiOperation("Actualiza un registro en Department")
  @PutMapping("/")
  @ResponseStatus(HttpStatus.OK)
  public void udpdateDepartment(@RequestBody Department obj) {
    departmentService.udpdateDepartment(obj);
  }

  @ApiOperation("Elimina un registro en Department")
  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteDepartment(@PathVariable("id") Integer id) {
    departmentService.deleteDepartment(id);
  }
}
