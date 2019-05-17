package com.example.demo.Repository;

import com.example.demo.Model.Department;
import com.example.demo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository2 extends JpaRepository<Department,Integer> {

}
