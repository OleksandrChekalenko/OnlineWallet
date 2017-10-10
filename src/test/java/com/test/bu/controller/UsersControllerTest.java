package com.test.bu.controller;

import com.test.bu.config.JpaConfigTest;
import com.test.bu.config.SpringConfig;
import com.test.bu.config.WebAppConfig;
import com.test.bu.entity.Users;
import com.test.bu.service.UsersService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class, JpaConfigTest.class, WebAppConfig.class})
@WebAppConfiguration
public class UsersControllerTest {



    @Autowired
    private WebApplicationContext context;
    private MockMvc mockMvc;

    @Before
    public  void  setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Autowired
    private UsersService usersService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createUser() throws Exception {
        Users user = new Users();
        user.setName("Paul");
        user.setFirstName("Richy");
        user.setPassword("1234");
        user.setPhoneNumber("789456123");
        usersService.save(user);

        mockMvc.perform(post("/newUser", 1))
                .andExpect(status().is(302))
                .andExpect(view().name("redirect:users"))
                .andExpect(model().attributeExists("users"));
    }

    @Test
    public void deleteUser() throws Exception {
    }

    @Test
    public void getAllUsers() throws Exception {
    }

}