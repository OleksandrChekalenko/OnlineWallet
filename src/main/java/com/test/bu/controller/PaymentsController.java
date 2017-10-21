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
    public String showExchangePage(Model model, Principal principal) {
        Users user = usersService.getUserByName(principal.getName());
        model.addAttribute("wallets", walletService.getAll(user.getId()));
        return "exchangePage";
    }

    @GetMapping("/transfer")
    public String showTransferPageWithAllUserWallets(Model model, Principal principal) {
        Users user = usersService.getUserByName(principal.getName());
        model.addAttribute("wallets", walletService.getAll(user.getId()));
        return "transferPage";
    }

    @GetMapping("/exchange/{number}")
    public String exchangeNumber(@PathVariable("number") long number, Model model){
        model.addAttribute("wallet", walletService.getByNumber(number));
        return "exchangePageNumber";
    }



    @GetMapping("/transfer/{number}")
    public String transferNumber(@PathVariable("number") long number, Model model){
        model.addAttribute("wallet", walletService.getByNumber(number));
        return "transferPageNumber";
    }

    @PostMapping("/transfer/moneyTransfer")
    public String moneyTransfer(@ModelAttribute("fromNumber") String fromNumber,
                                @ModelAttribute("numberTo") String numberTo,
                                @ModelAttribute("money") String money,
                                Model model) {
        walletService.transfer(Long.parseLong(fromNumber), Long.parseLong(numberTo), Double.parseDouble(money));
        return "redirect:/payments/transfer";
    }

    @PostMapping("/transfer/moneyExchange")
    public String moneyExchange(@ModelAttribute("fromNumber") String fromNumber,
                                @ModelAttribute("numberTo") String numberTo,
                                @ModelAttribute("money") String money,
                                Model model) {
        walletService.exchange(Long.parseLong(fromNumber), Long.parseLong(numberTo), Double.parseDouble(money));
        return "redirect:/payments/transfer";
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
