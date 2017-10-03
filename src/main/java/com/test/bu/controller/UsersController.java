package com.test.bu.controller;


import com.test.bu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/usersList")
    public String getAllUsers(Model model) {
        model.addAttribute("usersList", usersService.getAll());
        return "usersList";
    }

}
