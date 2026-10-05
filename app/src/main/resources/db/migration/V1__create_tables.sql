-- テーブル定義は docs/design/database.md を参照

CREATE TABLE users (
    id         BIGSERIAL    PRIMARY KEY,
    username   VARCHAR(50)  NOT NULL UNIQUE,
    password   VARCHAR(255) NOT NULL,
    created_at TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE categories (
    id         BIGSERIAL   PRIMARY KEY,
    user_id    BIGINT      NOT NULL REFERENCES users (id),
    name       VARCHAR(50) NOT NULL,
    created_at TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    -- ユーザーが違えば同じカテゴリ名を使える
    UNIQUE (user_id, name)
);

CREATE TABLE tasks (
    id           BIGSERIAL    PRIMARY KEY,
    user_id      BIGINT       NOT NULL REFERENCES users (id),
    -- カテゴリを削除したら、タスクは未分類（NULL）に戻す
    category_id  BIGINT       REFERENCES categories (id) ON DELETE SET NULL,
    title        VARCHAR(100) NOT NULL,
    description  TEXT,
    due_date     DATE,
    priority     VARCHAR(10)  NOT NULL DEFAULT 'MEDIUM',
    status       VARCHAR(20)  NOT NULL DEFAULT 'TODO',
    completed_at TIMESTAMP,
    -- NULLなら有効、値があれば論理削除済み
    deleted_at   TIMESTAMP,
    created_at   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- 一覧表示で毎回使う条件
CREATE INDEX idx_tasks_user_id_deleted_at ON tasks (user_id, deleted_at);
-- カテゴリでの絞り込み
CREATE INDEX idx_tasks_category_id ON tasks (category_id);
