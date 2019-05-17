package com.example.demo.Repository;


import com.example.demo.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository2 extends JpaRepository<Employee,Integer> {

}
