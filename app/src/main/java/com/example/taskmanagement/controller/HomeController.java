package com.example.taskmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // トップページはタスク一覧にする
    @GetMapping("/")
    public String home() {
        return "redirect:/tasks";
    }
}
