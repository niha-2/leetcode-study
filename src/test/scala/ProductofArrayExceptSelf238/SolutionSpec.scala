package ProductofArrayExceptSelf238

import org.scalatest.flatspec.AnyFlatSpec

class SolutionSpec extends AnyFlatSpec {
  val input = Array(1,2,3,4)
  val output = Array(24,12,8,6)
  assert(Solution.productExceptSelf(input) === output)
}
