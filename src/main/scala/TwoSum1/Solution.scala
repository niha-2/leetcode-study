package TwoSum1


object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    // Time: O(n), Memory: O(n)
    // 配列の最初からHashMapを作成しながら、現在の位置以前の値からペアを見つける
    import scala.collection.mutable
    var answer = new Array[Int](2)
    val preMap = new mutable.HashMap[Int, Int] // val : index
    for (i <- 0 to nums.length - 1) {
      val diff = target - nums(i)
      if (preMap.contains(diff)) answer = Array(i, preMap(diff))
      preMap(nums(i)) = i
    }
    answer

    // 解答
    // O(n^2)
    //    var answer = new Array[Int](2)
    //    for (i <- 0 to nums.length - 2) {
    //      for (j <- i + 1 to nums.length - 1) {
    //        if (nums(i) + nums(j) == target) answer = Array(i, j)
    //      }
    //    }
    //    answer
    //  }
  }
}