package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private EmployeeService service;

    @Test
    public void getAllEmployee() throws Exception {
        List<Employee> list = new ArrayList<>();
        given(service.getAllEmployee()).willReturn(list);

        this.mvc.perform(get("/employeeApi/v1/read"))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }

    @Test
    public void addEmployee() throws Exception {
        service.addEmployee(new Employee());

        this.mvc.perform(post("/employeeApi/v1/create/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(new Employee())))
                .andExpect(status().isCreated());
    }

    @Test
    public void udpdateEmployee() throws Exception {
        Employee updateEmployee = new Employee();

        this.mvc.perform(put("/employeeApi/v1/update/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(updateEmployee)))
                .andExpect(status().isOk());

    }

    @Test
    public void deleteEmployee() throws Exception {
        Employee employee = new Employee();
        employee.setIdDep(4);
        this.mvc.perform(MockMvcRequestBuilders.delete("/employeeApi/v1/delete/{id}",employee.getIdDep()))
                .andExpect(status().isOk());
    }

    public static String asJsonString(Object object) {
        try {
            return new ObjectMapper().writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}