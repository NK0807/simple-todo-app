# Simple ToDo App

Spring Bootを使用して作成した、シンプルなタスク管理アプリケーションです。
Webアプリケーション開発の基本となるCRUD操作（作成・参照・更新・削除）を実装しています。

※本アプリケーションは、生成AIによる技術的なサポート（コードの解説や実装のアドバイス）を受けながら開発を行いました。

## 🚀 機能一覧 (Features)

* **タスク登録 (Create)**: 新しいタスクを追加できます。
* **一覧表示 (Read)**: 登録されたタスクを一覧で確認できます。
* **状態更新 (Update)**: 「未完了/完了」のステータスをボタン一つで切り替えられます。
* **タスク削除 (Delete)**: 不要になったタスクを削除できます。

## 🛠 使用技術 (Tech Stack)

* **Java 21**
* **Spring Boot 3.4.1**
* **Thymeleaf** (テンプレートエンジン)
* **Spring Data JPA** (データベース操作)
* **H2 Database** (インメモリデータベース)
* **Lombok** (ボイラープレートコード削減)
* **Maven** (ビルドツール)

## 📦 起動方法 (How to Run)

1. リポジトリをクローンします。

    git clone [https://github.com/あなたのユーザー名/simple-todo-app.git](https://github.com/あなたのユーザー名/simple-todo-app.git)

2. ディレクトリに移動します。

    cd simple-todo-app

3. アプリケーションを起動します。

    ./mvnw spring-boot:run

4. ブラウザでアクセスします。
   http://localhost:8080

## 📂 ディレクトリ構成

* src/main/java/com/example/simple_todo_app
    * controller: 画面からのリクエストを受け付ける
    * service: ビジネスロジック（データの加工など）
    * repository: データベースとのやり取り
    * entity: データの設計図
* src/main/resources/templates: HTMLファイル
