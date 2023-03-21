package ValidSudoku36

import org.scalatest.funspec.AnyFunSpec

class SolutionSpec extends AnyFunSpec{
  val board = Array(
    Array('5', '3', '.', '.', '7', '.', '.', '.', '.')
    , Array('6', '.', '.', '1', '9', '5', '.', '.', '.')
    , Array('.', '9', '8', '.', '.', '.', '.', '6', '.')
    , Array('8', '.', '.', '.', '6', '.', '.', '.', '3')
    , Array('4', '.', '.', '8', '.', '3', '.', '.', '1')
    , Array('7', '.', '.', '.', '2', '.', '.', '.', '6')
    , Array('.', '6', '.', '.', '.', '.', '2', '8', '.')
    , Array('.', '.', '.', '4', '1', '9', '.', '.', '5')
    , Array('.', '.', '.', '.', '8', '.', '.', '7', '9'))
  assert(Solution.isValidSudoku(board) === true)
}
