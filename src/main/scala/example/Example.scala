package example

object Example {
  def ambrosia(n: Int): Int = {
    require(n >= 0)
    n + 1
  } ensuring { res => res >= n }

  def ejemplo: Int = {
    ambrosia(-1)
  }
}
