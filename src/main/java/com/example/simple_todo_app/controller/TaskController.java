package com.example.simple_todo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// ここはWebの受付係ですよという宣言
@RestController
public class TaskController {

    // トップページにアクセスが来たらここを実行してという指示
    @GetMapping("/")
    public String index() {
        return "<h1>ToDoアプリのTOPページです！</h1>";
    }
}