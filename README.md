# KotlinStudy

## 勉強メモ
基本はJSと構文が似ている。
- 異なる点
･ const -> val
･ let   -> var
･ 配列の定義
val arr = arrayListOf(1,2,3);

･ for文の書き方
Kotlinではfor文は
for(i in 0 .. 4) {処理}
と書く。また、その時、処理の中で i++ を書く必要は無い。

応用で、for文で配列をループさせるとき、
for (i in arr) {処理}
と書くことでiの中にarrの要素が代入される

･ 関数について
基本はJSと同じ定義の仕方であるが、Kotlinの場合は関数に引数があるとき型を宣言する必要がある。
例：
fun sayHello(arg: String) {...}

