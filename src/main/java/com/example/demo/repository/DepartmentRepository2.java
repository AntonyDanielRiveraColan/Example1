package com.example.demo.repository;

import com.example.demo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository2 extends JpaRepository<Department,Integer> {

}