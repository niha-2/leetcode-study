package ValidPalindrome125

import org.scalatest.funspec.AnyFunSpec

class SolutionSpec extends AnyFunSpec {
  val s = "A man, a plan, a canal: Panama"
  assert(Solution.isPalindrome(s))
}
