package other.example

import other.example.FunctionsWithStrings

class FunctionsWithStringsSpec extends munit.FunSuite {

  private val functionsWithStrings = new FunctionsWithStrings

  test("finding longest string should return max length string") {
    val input = List("a", "ab", "abc")
    assertEquals(functionsWithStrings.findLongestString(input), "abc")
  }

  test("finding longest string should empty if no string") {
    val input = List[String]()
    assertEquals(functionsWithStrings.findLongestString(input), "")
  }

//  test("finding shortest string should return min length string") {
//    val input = List("a", "ab", "abc")
//    assertEquals(functionsWithStrings.findShortestString(input), "a")
//  }
//
//  test("finding shortest string should empty if no string") {
//    val input = List[String]()
//    assertEquals(functionsWithStrings.findShortestString(input), "")
//  }

}
