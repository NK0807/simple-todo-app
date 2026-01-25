package com.example.simple_todo_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// ↓ RestController ではなく Controller にします
@Controller
public class TaskController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}