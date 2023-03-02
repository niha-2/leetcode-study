package ValidAnagram242

object Solution {
  def isAnagram(s: String, t: String): Boolean = {
    // 文字列を並び替える
    // sortアルゴリズムによって、使用メモリが最適化されるかは左右される
    s.sorted == t.sorted

//    import scala.collection.mutable
//    val SetS = new mutable.TreeSet[String]()
//    for (i <- 0 to s.length - 1) {
//      SetS.add(s.slice(i, 1))
//    }
//    val SetT = new mutable.TreeSet[String]()
//    for (i <- 0 to t.length - 1) {
//      SetT.add(s.slice(i, 1))
//    }
//    SetS == SetT
  }
}