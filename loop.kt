// 繰り返し構文確認テスト
// for文で１から１０までループを繰り返す。
// ただし、３の時はスキップ、７になったらループが終わる様にする。

fun main(){
  for (i in 1 .. 10){
    if(i == 3) continue
    if(i == 7) break
    println(i)
  }
}