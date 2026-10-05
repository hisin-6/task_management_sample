package com.example.taskmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.taskmanagement.entity.Task;

// 他ユーザーのデータを見せないよう、検索は必ず userId で絞り込む
// 論理削除済みのタスクは Task の @SQLRestriction で自動的に除外される
public interface TaskRepository extends JpaRepository<Task, Long> {

    // 一覧でカテゴリ名を表示するので、カテゴリもJOINして一緒に取得する
    // （open-in-view: false なので、画面側で遅延読み込みはできない）
    @EntityGraph(attributePaths = "category")
    List<Task> findByUserIdOrderByCreatedAtDesc(Long userId);

    Optional<Task> findByIdAndUserId(Long id, Long userId);
}
