package com.example.simple_todo_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tasks") // テーブル名
@Data            // Lombok
public class Task {

    @Id // これが背番号（主キー）という目印
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 番号は自動で振ってねという指示
    private Integer id;

    private String title; // タスクの内容

    private String status; // 進行状態（未完了・完了など）
}