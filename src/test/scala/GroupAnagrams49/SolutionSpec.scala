package GroupAnagrams49

import org.scalatest.flatspec.AnyFlatSpec
class SolutionSpec extends AnyFlatSpec {
  assert(Solution.groupAnagrams(Array("eat","tea","tan","ate","nat","bat")) === List(List("bat"),List("nat","tan"),List("ate","eat","tea")))
}
