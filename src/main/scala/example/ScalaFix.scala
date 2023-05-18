package example

import scala.concurrent.Future

final object ScalaFix {
  var x: Int = 0
  val y: String = null
  val aux = "text"

  def m(): Unit = {
    for {
      n <- List(1, 2, 3)
      val inc = n + 1
    } yield inc
  }

}
