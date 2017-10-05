package com.test.bu.controller;


import com.test.bu.entity.Users;
import com.test.bu.entity.Wallet;
import com.test.bu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @PostMapping("/newUser")
    public String createUser(@ModelAttribute Users user) {
        usersService.save(user);
        return "redirect:users";
    }

   /* @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        usersService.delete(id);
        return "redirect:/users";
    }*/

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("usersList", usersService.getAll());
        return "usersList";
    }
}
