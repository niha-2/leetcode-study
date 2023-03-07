package GroupAnagrams49

object Solution {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    val sortedStrs = strs.map(x => (x.toList.sorted.mkString(""), x)).toList
    val groupedStrs = sortedStrs.groupBy(_._1)

    groupedStrs.values.toList.map(_.map(_._2)).map(_.sorted)
  }
}