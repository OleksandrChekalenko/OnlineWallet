package com.test.bu.controller;


import com.test.bu.entity.Wallet;
import com.test.bu.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/wallets/{walletsNumber}")
    public String getWalletByNumber(@PathVariable("walletsNumber") int number, Model model) {
        model.addAttribute("wallet", walletService.getById(number));
        return "showWallet";
    }

    @GetMapping("/wallets")
    public String getAllWallets(Model model) {
        model.addAttribute("wallets", walletService.getAll());
        return "walletList";
    }

    @PostMapping("/newWallet")
    public String createWallet(@ModelAttribute Wallet wallet) {
        walletService.save(wallet);
        return "redirect:wallets";
    }

    @GetMapping("/edit/{id}")
    public String editPage(@PathVariable("id") int id, Model model) {
        System.out.println("id = " + id);
        model.addAttribute("wallet", walletService.getById(id));
        return "editWallet";
    }

    @PostMapping("/editWallet")
    public String editWallet(@ModelAttribute Wallet wallet, Model model) {
        walletService.update(wallet);
        return "redirect:edit/" + wallet.getId();
    }

    @GetMapping("/delete/{walletNumber}")
    public String deleteWallet(@PathVariable("walletNumber") int number) {
        walletService.delete(number);
        return "redirect:/wallets";
    }

    @PostMapping("/delete")
    public String deleteNumber2(@ModelAttribute("id") int number) {
        walletService.delete(number);
        return "redirect:wallets";
    }
}
