// 条件分岐確認テスト
// 10代、20代、30代、それ以外の年齢によって出力を変える
// 入力はそれぞれ10, 21, 32, 43, 5の5つの値を入力する
// 10代の場合は10、20代の場合は20、30代の場合は30、それ以外の場合はotherと出力する

fun main() {
  val var1 = 10
  val var2 = 21
  val var3 = 32
  val var4 = 43
  val var5 = 5

  age(var1)
  age(var2)
  age(var3)
  age(var4)
  age(var5)
}
fun age(age: Int) {
  if (10 <= age && age < 20){
    println("10")
  } else if (20 <= age && age < 30){
    println("20")
  } else if (30 <= age && age < 40){
    println("30")
  } else {
    println("other")
  }
}