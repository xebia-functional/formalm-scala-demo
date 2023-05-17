package example

object Hello extends Greeting

trait Greeting {
  lazy val greeting: String = "hello"
}
