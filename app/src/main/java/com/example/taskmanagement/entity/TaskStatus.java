package com.example.taskmanagement.entity;

// Status だと他のライブラリのクラス名とぶつかりやすいので TaskStatus にしている
public enum TaskStatus {
    TODO("未着手"),
    IN_PROGRESS("進行中"),
    DONE("完了");

    // 画面に表示する名前
    private final String label;

    TaskStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
