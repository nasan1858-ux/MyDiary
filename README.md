# MyDiaryについて
MyDiaryは日記投稿システムです。

## 機能リスト
1. 日記管理機能
    - 投稿
    - 編集
1. ログイン認証機能

## ページ構成 alt + shift + f でフォーマット化
| URL         | 内容         |
| :-----------: | :------------: |
| /home       | トップページ |
| /diary/list | リスト       |

---

## メソッドについて
メソッド名は、`setName(String name)`のようにキャメルケースにしてください

```java
public void setName(String name) {
    this.name = name;
}
```