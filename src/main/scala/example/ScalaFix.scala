package example

final object ScalaFix {
  var x: Int = 0
  val y: String = null
  val pimp = "text"

  def m(): Unit = {
    for {
      n <- List(1, 2, 3)
      val inc = n + 1
    } yield inc
  }

  def m1(): Unit = {
    println(s"Foo")
  }

}
