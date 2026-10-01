# 学習計画（約1か月）

テーマ：タスク管理アプリを Java + Spring Boot で作る
期間：2026-10-01 〜 2026-10-30（目安）

## ゴール
- Spring Boot で CRUD + ログイン機能のある Web アプリを一人で作れる
- 設計 → 実装 → テストの流れを一通り経験する
- 成果物（GitHub リポジトリ）を次の案件の面談でアピールできる状態にする

## 技術スタック
| 分類 | 技術 |
| --- | --- |
| 言語 | Java 21 |
| フレームワーク | Spring Boot 3 / Spring Data JPA / Spring Security |
| 画面 | Thymeleaf（＋Bootstrap） |
| DB | H2（開発初期）→ MySQL or PostgreSQL |
| ビルド | Gradle or Maven |
| テスト | JUnit 5 / Mockito / MockMvc |
| 管理 | Git / GitHub |

---

## 1週目（10/1〜10/9）：設計 & 環境構築
- [ ] 要件定義（`docs/requirements.md` を埋める）
- [ ] 画面一覧・画面遷移図（`docs/design/`）
- [ ] テーブル設計・ER図（`docs/design/`）
- [ ] 開発環境構築（JDK / IDE / Spring Initializr でプロジェクト作成 → `app/`）
- [ ] GitHub リポジトリ作成
- [ ] Hello World 画面を表示する

## 2週目（10/12〜10/16）：基本 CRUD
- [ ] Entity / Repository / Service / Controller の層構造を理解
- [ ] タスク一覧・登録・編集・削除
- [ ] 入力チェック（Bean Validation）
- [ ] H2 → MySQL/PostgreSQL へ切り替え

## 3週目（10/19〜10/23）：機能拡張
- [ ] Spring Security でログイン / ユーザー登録
- [ ] ユーザーごとのタスク管理
- [ ] ステータス（未着手/進行中/完了）・期限・優先度
- [ ] 検索・絞り込み・並び替え・ページング
- [ ] 例外処理・エラー画面

## 4週目（10/26〜10/30）：テスト & 仕上げ
- [ ] 単体テスト（Service）・結合テスト（Controller / MockMvc）
- [ ] リファクタリング
- [ ] README 整備（機能・画面キャプチャ・起動方法）
- [ ] 振り返り（学んだこと・次にやりたいこと）
- [ ] 余裕があれば：REST API 化 / Docker 化 / デプロイ

---

## 運用ルール
- 毎日 `docs/daily-report/` に日報を書く（待機中の報告にも使える）
- 週末に進捗を見て、翌週の計画を調整する
- 案件が決まったらそこで区切ってOK。それまでの成果をまとめておく
