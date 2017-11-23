package com.test.bu.controller;


import com.test.bu.entity.Users;
import com.test.bu.entity.Wallet;
import com.test.bu.service.interfaces.RoleService;
import com.test.bu.service.interfaces.UsersService;
import com.test.bu.service.interfaces.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private WalletService walletService;

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
        Users user = usersService.getById(id);
        roleService.delete(user.getName());
        List<Wallet> allUserWalletsList = walletService.getAll(id);
        for (Wallet wallet : allUserWalletsList) {
            walletService.delete(wallet.getNumber());
        }
        usersService.delete(id);
        return "redirect:/user/users";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("userList", usersService.getAll());
        return "usersList";
    }

    @GetMapping("/users/sortById")
    public String sortUsersById(Model model) {
        model.addAttribute("user", usersService.sortUsersById(usersService.getAll()));
        return "redirect:/user/users";
    }

    @GetMapping("/users/sortByName")
    public String sortUsersByName(Model model) {
        model.addAttribute("user", usersService.sortUsersByName(usersService.getAll()));
        return "usersList";
    }

    @GetMapping("/users/sortByFirstName")
    public String sortUsersByFirstName(Model model) {
        model.addAttribute("user", usersService.sortUsersByFirstName(usersService.getAll()));
        return "usersList";
    }

    @GetMapping("/users/sortByEmail")
    public String sortUsersByEmail(Model model) {
        model.addAttribute("user", usersService.sortUsersByEmail(usersService.getAll()));
        return "usersList";
    }
}
