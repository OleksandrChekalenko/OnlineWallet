package com.test.bu.controller;

import com.test.bu.entity.Users;
import com.test.bu.entity.Wallet;
import com.test.bu.service.UsersService;
import com.test.bu.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/payments")
public class PaymentsController {

    @Autowired
    private UsersService usersService;
    @Autowired
    private WalletService walletService;

    @GetMapping("/archive")
    public String showArchivePage(){
        return "archivePage";
    }

    @GetMapping("/exchange")
    public String showExchangePage() {
        return "exchangePage";
    }

    @GetMapping("/transfer")
    public String showTransferPage() {
        return "transferPage";
    }

    @GetMapping("/refill")
    public String showRefillPage(){
        return "refillPage";
    }
    @GetMapping("/refill/{number}")
    public String addFunds(@PathVariable("number") long number, Model model){
        /*Wallet wallet = walletService.getByNumber(number);*/
        model.addAttribute("wallet", walletService.getByNumber(number));
        return "refillPage";
    }
    @PostMapping("/refill/addFunds")
    public String update(@ModelAttribute Wallet wallet) {
       /*wallet.setFunds(wallet.getFunds() + funds);*/
        walletService.update(wallet);
        return "redirect:/wallet/wallets";
    }

}
