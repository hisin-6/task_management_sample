package com.example.taskmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.taskmanagement.service.TaskService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    // TODO: ログイン機能を作ったら、ログイン中のユーザーのIDに置き換える
    // それまでは V2__insert_dev_data.sql で登録した開発用ユーザーを使う
    private static final Long DEV_USER_ID = 1L;

    private final TaskService taskService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("tasks", taskService.findAll(DEV_USER_ID));
        return "tasks/list";
    }
}
