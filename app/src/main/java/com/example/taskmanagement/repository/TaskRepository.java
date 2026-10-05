package com.example.taskmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskmanagement.entity.Task;

// 他ユーザーのデータを見せないよう、検索は必ず userId で絞り込む
// 論理削除済みのタスクは Task の @SQLRestriction で自動的に除外される
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUserIdOrderByCreatedAtDesc(Long userId);

    Optional<Task> findByIdAndUserId(Long id, Long userId);
}
