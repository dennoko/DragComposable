# Composable をドラッグ操作してみたい！
## アプリの概要
ドラッグできるコンポーザブルが2つ並んでいるだけです。

![image](https://github.com/dennoko/DragComposable/assets/145789995/d6b61455-6642-438e-a607-b682ee49a400)

こちらにComposableを動かすコードの実装について軽く書いてあります。
https://charm-course-2f9.notion.site/Composable-c62eeee884c84f3fb38a17b1f5d09ae4?pvs=4

Drag Me1 は Text の modifier で直接動かせるようにしたもの、Drag Me2 は引数として渡された Composable をラップして動かせるようにしたものです。

# 作った感想
案外簡単に実装出来ましたね...
いろいろ試す中で Jetpack に対する理解が少し深まりました。
Composable を動かすついでに MaterialTheme についても触ってみたのですが、ちゃんと rightTheme と darkTheme でアプリのコンポーネントの色が変わるのはいいですね。
今後はちゃんとこの機能を使っていこうと思います。
