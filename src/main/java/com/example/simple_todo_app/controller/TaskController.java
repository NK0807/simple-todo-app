package com.example.simple_todo_app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.simple_todo_app.entity.Task;
import com.example.simple_todo_app.service.TaskService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor	// Serviceを使うため
public class TaskController {

	private final TaskService service;
	
    @GetMapping("/")
    public String index(Model model) {
    	// タスク一覧をもらう
        List<Task> taskList = service.findAll();
        
        //HTMLに渡すための箱(Model)に、"tasks" という名前で入れる
        model.addAttribute("tasks", taskList);
        
        return "index";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Task task) {
        // 新しいタスクを保存
        task.setStatus("未完了");
        service.save(task);
        // トップページに戻る
        return "redirect:/";
    }
}