# オブジェクト指向課題

Javaによる模範解答です。
<br>各設問毎にブランチが切られており、設問の回答が記載されています。

## 課題

### 下記の仕様を前提として、以下の問いに答えてください。

回答に際しては以下の注意事項に留意して下さい。

- 各設問に関してはコードとともにその時点でのクラス図、アクティビティ図も提出すること
- 課題の仕様を満たす実装をすること
- 出力結果も仕様を満たし、かつ明瞭であること
- 課題に細かく記載のない仕様に関してはどのような設計判断を下したかがレビュワーに分かるように説明を記述すること
- 距離や速度などは単位に注意し、出力する場合は単位も明記すること
- Q6 に関しては単に順位だけではなく、途中経過などレース状況が分かるように出力すること

#### 自動車には3種類の自動車がある（種類は将来増える可能性がある）
- 1つめはHondaで他の車より定員数が多い
- 2つめはNissanで他の車より価格が安い
- 3つめはFerrariで他の車より価格が高く、定員数が少なく、加速が速い
- 全ての自動車にはアクセルとブレーキがある

##### (Q1)
これらの仕様に矛盾のない形でコードで記述せよ。ただし、実行ファイルを作成することとし、仕様が満たされていることを実行結果としてコンソールで確認できること。

##### (Q2)
Ferrariだけはフロント車高を40mmリフトアップすることができるが、このとき加速は20%低下するものとする。逆に、リフトダウンを行うと車高も加速も戻る。また、リフトアップを行っていないとリフトダウンはできないものとする。この仕様を実装せよ。実行ファイルでは、リフトアップ前後の車高と加速数値を表示すること。

##### (Q3)
3種類の自動車をそれぞれランダム数の生成を行い、価格についても冒頭の仕様を満たす上でランダムとした場合、生成した全ての自動車の合計金額および平均金額を求めるメソッドを記述せよ。

##### (Q4)
全ての自動車は、乗員数が1名増えるごとに5%の加速性能が低下する。もちろん、乗員数は定員を超えることはない。ただし、Nissanには生産時の欠陥が発生し、加速値の60%しか性能が出ないことが分かった。この仕様を実装せよ。

##### (Q6)
新たにToyotaという自動車が加わり、このToyotaは価格が決まると加速性能が価格に比例して自動的に決まるものとする。4種類の自動車でレースを行う場合、ゴールした順位はどのようなものになるかシミュレートせよ。レース距離は任意に決めてよく、ブレーキを踏む確率も任意でよい。

## 実行方法

1. [Gradleの公式インストールガイド](https://gradle.org/install/)に従って、Gradleをインストール
2. プロジェクトのルートディレクトリで以下のコマンドを実行することで結果が出力されます。

  ```
  $ gradle run
  ```

## UMLドキュメントについて

`docs`ディレクトリに設計判断についてのドキュメント、および各設問の回答時点でのクラス図、およびアクティビティ図が格納されています。

