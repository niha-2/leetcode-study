package ValidPalindrome125

object Solution {
  def isPalindrome(s: String): Boolean = {
    val sOutput = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
    sOutput == sOutput.reverse
  }
}
