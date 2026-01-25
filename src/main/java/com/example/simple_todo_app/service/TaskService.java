package com.example.simple_todo_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.simple_todo_app.entity.Task;
import com.example.simple_todo_app.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // コンストラクタを自動で作る
public class TaskService {

    private final TaskRepository repository; // 倉庫番を呼び出す準備

    // タスクを全部取ってくるメソッド
    public List<Task> findAll() {
        return repository.findAll();
    }
}