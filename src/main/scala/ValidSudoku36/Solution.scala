package ValidSudoku36

import scala.collection.mutable


/**
 * 9×9の数独の盤面が有効かどうかを判定する。以下のルールに従って、塗りつぶされたセルのみを検証する必要がある。
 * 各行には、1～9の数字が繰り返しなく含まれていること。
 * 各列には1〜9の数字が重複なく含まれていなければならない
 * 3×3の9つのサブボックスには、1～9の数字が繰り返し含まれていなければならない。
 */
object Solution {
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val cols = mutable.HashMap.empty[Int, mutable.HashSet[Int]]
    val rows = mutable.HashMap.empty[Int, mutable.HashSet[Int]]
    val squares = mutable.HashMap.empty[(Int, Int), mutable.HashSet[Int]]

    var flag = true
    for (i <- 0 to 8) {
      for (j <- 0 to 8) {
        if (board(i)(j) != '.') {
          if (rows.getOrElse(i, mutable.HashSet.empty[Int]).contains(board(i)(j))
            || cols.getOrElse(j, mutable.HashSet.empty[Int]).contains(board(i)(j))
            || squares.getOrElse((i/3, j/3), mutable.HashSet.empty[Int]).contains(board(i)(j))) {
            flag = false
          } else {
            rows(i) = rows.getOrElse(i, mutable.HashSet.empty[Int]) + board(i)(j)
            cols(j) = cols.getOrElse(j, mutable.HashSet.empty[Int]) + board(i)(j)
            squares((i/3, j/3)) = squares.getOrElse((i/3, j/3), mutable.HashSet.empty[Int]) + board(i)(j)
          }
        }
      }
    }
    flag
  }
}