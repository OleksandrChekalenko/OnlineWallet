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

    @GetMapping("/wallets/{NUMBER}")
    public String getWalletByNumber(@PathVariable("NUMBER") int number, Model model) {
        model.addAttribute("wallet", walletService.getByNumber(number));
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

    @GetMapping("/edit/{NUMBER}")
    public String editPage(@PathVariable("NUMBER") int number, Model model) {
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
    public String deleteWallet(@PathVariable("number") int number) {
        walletService.delete(number);
        return "redirect:/wallets";
    }

   /* @PostMapping("/delete")
    public String deleteNumber2(@ModelAttribute("NUMBER") int number) {
        walletService.delete(number);
        return "redirect:/wallets";
    }*/
}
