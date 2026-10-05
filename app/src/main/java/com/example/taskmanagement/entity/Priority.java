package com.example.taskmanagement.entity;

public enum Priority {
    HIGH("高"),
    MEDIUM("中"),
    LOW("低");

    // 画面に表示する名前
    private final String label;

    Priority(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
