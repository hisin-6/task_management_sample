-- 開発用のデータ。ログイン機能ができるまでは、このユーザー（id = 1）のタスクを表示する
-- 本番環境を作るときは、このデータが入らないようにする

-- パスワードは「password」をBCryptでハッシュ化した値
INSERT INTO users (username, password)
VALUES ('devuser', '$2a$10$dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG');

INSERT INTO categories (user_id, name)
VALUES (1, '仕事'),
       (1, '勉強');

INSERT INTO tasks (user_id, category_id, title, description, due_date, priority, status, completed_at)
VALUES (1, 2, 'Flywayでテーブルを作る', 'database.md のとおりに作成する', '2026-10-05', 'HIGH', 'DONE', '2026-10-05 10:20:00'),
       (1, 2, 'タスク一覧画面を作る', NULL, '2026-10-16', 'HIGH', 'IN_PROGRESS', NULL),
       (1, 1, '週報を提出する', NULL, '2026-10-03', 'MEDIUM', 'TODO', NULL),
       (1, NULL, '部屋の掃除', '未分類のタスクの例', NULL, 'LOW', 'TODO', NULL);
