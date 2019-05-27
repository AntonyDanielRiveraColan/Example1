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


/**  la sgt notacion,automaticamente publica como un  Spring REST Service a la clase.*/
@RestController

/** La siguiente notacion nos redirecciona  a un conjunto de  formularios apollado de la
 * notacion @GetMapping */
@RequestMapping("/departmentApi/v1")

@Api(tags = "CRUD de Department") /** Apoya la documentacion del swagger nombra a la clase*/
public class DepartmentController {

  /**
   * La sgt notacion busca objeto manejado (beans) que implemente determinada
   * interfaz para hacer referencia a él. De esta manera no es neceario crear una instancia nueva
   * del objeto cada vez que se necesite la funcionalidad de determinada clase
   */
  @Autowired
  DepartmentService departmentService;

  /**
   * La sgt notacion se utiliza para nombrar en swagger.
   * A una metodo que realiza una operacion determinada
   */
  @ApiOperation("Retorna una lista de Department")
  @GetMapping("/")
  @ResponseStatus(HttpStatus.OK) /** Esta notacion indica el mensaje de estado esperado*/
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
