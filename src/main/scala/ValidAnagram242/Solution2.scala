package ValidAnagram242

object Solution2 {
  def isAnagram(s: String, t: String): Boolean = {
    // HashMap
    // O(s + t)
    import scala.collection.mutable.HashMap
    if (s.length != t.length) false else {
      val countS = new HashMap[String, Int]
      val countT = new HashMap[String, Int]

      for (x <- 0 to s.length - 1) {
        countS(s.slice(x, x+1)) = 1 + countS.getOrElse(s.slice(x, x+1), 0)
        countT(t.slice(x, x+1)) = 1 + countT.getOrElse(t.slice(x, x+1), 0)
      }
      countS.forall{case (s, t) =>
        countT.exists(_ == (s, t))
      }
    }
  }
}