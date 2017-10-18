package com.test.bu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payments")
public class ArchiveController {

    @GetMapping("/archive")
    public String showArchivePage(){
        return "archivePage";
    }
}
