package com.test.bu.controller;


import com.test.bu.entity.Role;
import com.test.bu.entity.Users;
import com.test.bu.entity.Wallet;
import com.test.bu.service.RoleService;
import com.test.bu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;
    @Autowired
    private RoleService roleService;

    @GetMapping("edit/{id}")
    public String editPage(@PathVariable("id") int id, Model model) {

        model.addAttribute("users", usersService.getById(id));
        return "editUser";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Users user) {
        usersService.update(user);
        return "redirect:/user/users";
    }
    /*@PostMapping("/newUser")
    public String createUser(@ModelAttribute Users user) {
        usersService.save(user);
        return "susuccessRegistration";
    }*/

    @GetMapping("users/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        //roleService.delete(getRoleById(id));
        usersService.delete(id);
        return "redirect:/user/users";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("usersList", usersService.getAll());
        return "usersList";
    }
}
