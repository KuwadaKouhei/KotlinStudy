// 関数確認テスト
// 3つの引数を受け取る関数を定義し、9, 4, 2の平均を出力する
fun main() {
    val avg = average(9, 4, 2)
    println(avg)
}
fun average (a: Int, b: Int, c: Int): Int {
    return (a + b + c) / 3
}