package com.example.demo.Repository;

import com.example.demo.Model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface DepartmentRepository extends CrudRepository<Department, Long>   {

}
