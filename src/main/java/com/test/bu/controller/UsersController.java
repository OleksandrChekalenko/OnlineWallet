package com.test.bu.controller;


import com.test.bu.entity.Users;
import com.test.bu.entity.Wallet;
import com.test.bu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    /*@PostMapping("/newWallet")
    public String createWallet(@ModelAttribute Wallet wallet) {
        walletService.save(wallet);
        return "redirect:wallets";*/

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        model.addAttribute("usersList", usersService.getAll());
        return "usersList";
    }
}
