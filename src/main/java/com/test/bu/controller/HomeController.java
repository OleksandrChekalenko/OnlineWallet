package com.test.bu.controller;

import com.test.bu.entity.Users;
import com.test.bu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "loginPage";
    }

    @GetMapping("/error_page")
    public String errorPage() {
        return "errorPage";
    }

    @PostMapping("/newUser")
    public String createUser(@ModelAttribute Users user) {
        usersService.save(user);
        return "susuccessRegistration";
    }
}
