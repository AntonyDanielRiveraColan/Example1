package com.example.demo.Controller;

import com.example.demo.Model.Department;
import com.example.demo.Service.DepartmentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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

        /*this.mvc.perform(get("/departmentApi/v1/read"))
                .andExpect(status().isNotFound())
                .andReturn ();*/

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
    public void udpdateDepartment() {
    }

    @Test
    public void deleteDepartment() {
    }

    public static String asJsonString(Object object) {
        try {
            return new ObjectMapper().writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}