package LongestConsecutiveSequence128

object Solution {
  /**
   * 整数のソートされていない配列 nums が与えられたとき、
   * 最も長い連続した要素列の長さを返す。
   * また、O(n)時間で実行されるアルゴリズムであること。
   * @param nums
   * @return 最も長い連続した要素列の長さ
   */
  def longestConsecutive(nums: Array[Int]): Int = {
    val numsSeq = nums.toSeq
    val numsSet = nums.toSet

    numsSeq.foldLeft(0){(acc, num) =>
      if (!numsSet.contains(num - 1)) {
        def calcLength(length: Int): Int =
          if (!numsSet.contains(num + length)) length else calcLength(length + 1)

        val length = calcLength(0)
        math.max(acc, length)
      } else acc
    }
  }
}






