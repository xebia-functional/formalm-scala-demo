package other.example

class FunctionsWithStrings {
  def findLongestString(input: List[String]): String = {
    if (input.isEmpty)
      return ""
    else
      input.maxBy(_.length)
  }

  def findShortestString(input: List[String]): String = {
    if (input.isEmpty)
      return ""
    else
      input.minBy(_.length)
  }
}
