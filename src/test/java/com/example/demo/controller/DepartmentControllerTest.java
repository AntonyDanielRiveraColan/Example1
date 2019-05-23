package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;
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
@WebMvcTest(DepartmentController.class)
public class DepartmentControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private DepartmentService service;

    @Test
    public void getAllDepartment() throws Exception {

        List<Department> list = new ArrayList<>();
        given(service.getAllDepartment()).willReturn(list);

        this.mvc.perform(get("/departmentApi/v1/read"))
            .andExpect(status().isOk())
            .andExpect(content().json("[]"));

    }

    @Test
    public void addDepartment() throws Exception {

        service.addDepartment(new Department());

        this.mvc.perform(post("/departmentApi/v1/create/")
            .contentType(MediaType.APPLICATION_JSON)
            .content(asJsonString(new Department())))
            .andExpect(status().isCreated());

    }

    @Test
    public void udpdateDepartment() throws Exception {
        Department updatedDepartment = new Department();

        this.mvc.perform(put("/departmentApi/v1/update/")
            .contentType(MediaType.APPLICATION_JSON)
            .content(asJsonString(updatedDepartment)))
            .andExpect(status().isOk());

    }

    @Test
    public void deleteDepartment() throws Exception {

        Department department = new Department();
        department.setIdDep(4);
        this.mvc.perform(
            MockMvcRequestBuilders.delete("/departmentApi/v1/delete/{id}", department.getIdDep()))
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