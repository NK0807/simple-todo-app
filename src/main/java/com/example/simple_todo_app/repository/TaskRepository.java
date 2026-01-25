package com.example.simple_todo_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simple_todo_app.entity.Task;

@Repository // これは倉庫番という目印
public interface TaskRepository extends JpaRepository<Task, Integer> {

}