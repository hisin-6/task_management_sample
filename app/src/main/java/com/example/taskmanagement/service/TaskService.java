package com.example.taskmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.taskmanagement.entity.Task;
import com.example.taskmanagement.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> findAll(Long userId) {
        return taskRepository.findByUserIdOrderByCreatedAtDesc(userId);
    }
}
