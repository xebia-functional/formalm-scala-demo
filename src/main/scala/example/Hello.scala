package example

object Hello extends Greeting

trait Greeting {
  lazy val greeting: String = "hello"
}

object Example {
  def ambrosia(n: Int): Int = {
    require(n >= 0)
    n + 1
  } ensuring { res => res >= n }

  def ejemplo: Int = {
    ambrosia(-1)
  }
}
