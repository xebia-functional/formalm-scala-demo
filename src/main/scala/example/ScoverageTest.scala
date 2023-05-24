package example

def myDummyFun(): Unit = {
  for {
    n <- List(1, 2, 3)
    inc = n + 1
  } yield inc
}

def myOtherFun(): Unit = {
  print("Hello World!")
}

def myThirdFun(): Unit = {
  print("Hello World!")
}
