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

    // 保存する機能
    public void save(Task task) {
        repository.save(task);
    }

    // IDを受け取って、そのタスクの状態をくるっと入れ替える
    public void updateStatus(Integer id) {
        // IDでタスクを検索する（見つからなかったら何もしない）
        Task task = repository.findById(id).orElse(null);
        
        if (task != null) {
            // 状態を入れ替える
            if ("未完了".equals(task.getStatus())) {
                task.setStatus("完了");
            } else {
                task.setStatus("未完了");
            }
            // 上書き保存する（IDが同じなら自動で更新扱いになる）
            repository.save(task);
        }
    }
}