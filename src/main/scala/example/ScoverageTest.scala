package example

def myDummyFun(): Unit = {
  for {
    n <- List(1, 2, 3)
    inc = n + 1
  } yield inc
}
