package com.example.demo;

import com.example.demo.Model.Department;
import com.example.demo.Model.Employee;
import com.example.demo.Repository.DepartmentRepository;
import com.example.demo.Repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(DepartmentRepository repository, EmployeeRepository repository2){
        return args -> {
            repository.save( new Department("Jose","Administracion"));
            repository2.save(new Employee(48149738,"Maria",1200,997755520,1,true));
        };
    }
}

