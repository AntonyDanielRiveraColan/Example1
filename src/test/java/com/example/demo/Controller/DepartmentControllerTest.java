package com.example.demo.Controller;

import com.example.demo.Model.Department;
import com.example.demo.Service.DepartmentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
public class DepartmentControllerTest {

    private MockMvc mockMvc;

    @InjectMocks
    private Department department;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getAllDepartment() throws Exception {
        //completar el comentario de abajo
   // mockMvc = MockMvcBuilders.standaloneSetup()

    }

    @Test
    public void addDepartment() throws Exception {

    }

    @Test
    public void udpdateDepartment() {
    }

    @Test
    public void deleteDepartment() {
    }
}