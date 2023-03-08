package TopKFrequentElements347

import scala.collection.mutable

object Solution {
  /**
   * 整数配列 numsと整数 k を指定して、頻度の高い方からk番目までの整数配列を返す。
   * Input: nums = [1,1,1,2,2,3], k = 2
   * Output: [1,2]
   * @param nums
   * @param k
   * @return 頻度が高い方からk番目までの整数配列
   */
  def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
    val numsSeq = nums.toSeq

    // (num -> frequency)
    val frequencyMap = numsSeq.foldLeft(mutable.HashMap.empty[Int, Int]) { (ac, num) =>
      ac(num) = ac.getOrElse(num, 0) + 1
      ac
    }
    val sortedFrequencySeq = frequencyMap.toSeq.sortBy(_._2).map(_._1).reverse

    val res = sortedFrequencySeq.slice(0, k)
    res.toArray
  }
}
