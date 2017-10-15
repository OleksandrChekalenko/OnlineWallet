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
import java.util.List;

@Controller
@RequestMapping("/wallet")
public class WalletController {


   //protected static long countWalletsNumber=100000000;
    @Autowired
    private UsersService usersService;

    @Autowired
    private WalletService walletService;


    @GetMapping("/wallets/{NUMBER}")
    public String getWalletByNumber(@PathVariable("NUMBER") int number, Model model) {
        model.addAttribute("wallet", walletService.getByNumber(number));
        return "showWallet";
    }



    @GetMapping("/wallets")
    public String getAllWallets(Model model, Principal principal) {
        Users user = usersService.getUserByName(principal.getName());
        model.addAttribute("wallets", walletService.getAll(user.getId()));
        return "walletList";
    }

    @GetMapping("/wallets/addWallet")
    public String createNewWallet(Model model, Principal principal) {
        return "addWallet";
    }

    @PostMapping("/newWallet")
    public String createWallet(@ModelAttribute Wallet wallet, Principal principal) {
        wallet.setNumber(walletService.getWalletsInDB() + 100_000_000);
        List<Long> allWalletNumbersList = walletService.getAllWalletNumbers();
        for (Long w : allWalletNumbersList) {
            if (w == wallet.getNumber()) {
             wallet.setNumber(wallet.getNumber() + 1);
            }
        }
        Users user = usersService.getUserByName(principal.getName());
        user.getWalletsList().add(wallet);
        wallet.setUserId(user);
        usersService.update(user);
        walletService.save(wallet);
        return "redirect:/wallet/wallets";
    }

    @GetMapping("/edit/{NUMBER}")
    public String editPage(@PathVariable("NUMBER") long number, Model model) {
        System.out.println("number = " + number);
        model.addAttribute("wallet", walletService.getByNumber(number));
        return "editWallet";
    }

    @PostMapping("/editWallet")
    public String editWallet(@ModelAttribute Wallet wallet, Model model) {
        walletService.update(wallet);
        return "redirect:edit/" + wallet.getNumber();
    }

    @GetMapping("wallets/delete/{number}")
    public String deleteWallet(@PathVariable("number") int number, Principal principal) {
        Users user = usersService.getUserByName(principal.getName());
        Wallet wallet = walletService.getByNumber(number);
        Users userFromPrincipal = wallet.getUserId();
        if (user.getId() == userFromPrincipal.getId()) {
            wallet.setUserId(null);
            walletService.update(wallet);
            walletService.delete(number);
        }
        return "redirect:/wallet/wallets";
    }

}
