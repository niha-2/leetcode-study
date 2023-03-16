package ProductofArrayExceptSelf238

object Solution {
  /**
   * 整数配列numsが与えられたとき、
   * answer[i]がnums[i]を除くnumsのすべての要素の積に等しくなるような
   * 配列answerを返す。
   * Input: nums = [1,2,3,4]
   * Output: [24,12,8,6]
   * @param nums
   * @return
   */
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val numsSeq = nums.toSeq
    val res = if (numsSeq.length <= 1) {
      numsSeq
    } else {
      val rightToLeft = numsSeq.dropRight(1)
      val leftToRight = numsSeq.drop(1)

      val rightToLeftComputed = rightToLeft.scanLeft(1)((acc, next) => next * acc)
      val leftToRightComputed = leftToRight.scanRight(1)((acc, next) => next * acc)
      rightToLeftComputed.zip(leftToRightComputed).map{ case (i, j) => i * j}
    }
    res.toArray
  }
}