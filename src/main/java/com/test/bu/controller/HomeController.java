package com.test.bu.controller;

import com.test.bu.entity.Role;
import com.test.bu.entity.Users;
import com.test.bu.service.interfaces.RoleService;
import com.test.bu.service.interfaces.UsersService;
import com.test.bu.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private UsersService usersService;
    @Autowired
    private RoleService roleService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "loginPage";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute Users users) {
        return "index";
    }

    @GetMapping("/error_page")
    public String errorPage() {
        return "errorPage";
    }

    @PostMapping("/newUser")
    public String createUser(@ModelAttribute Users user, Model model) {
        List<String> errors = Utils.validate(user);
        if (!errors.isEmpty()) {
            model.addAttribute("errors", errors);
            return "registrationPage";
        } else {
            Role role = new Role();
            role.setName(user.getName());
            role.setRole("ROLE_USER");
            roleService.save(role);
            usersService.save(user);
            return "susuccessRegistration";
        }
    }
}
