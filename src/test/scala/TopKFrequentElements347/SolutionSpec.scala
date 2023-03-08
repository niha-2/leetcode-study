package TopKFrequentElements347

import org.scalatest.flatspec.AnyFlatSpec

class SolutionSpec extends AnyFlatSpec {
  assert(Solution.topKFrequent(Array(1, 1, 1, 2, 2, 3), 2) === Array(1, 2))
}
