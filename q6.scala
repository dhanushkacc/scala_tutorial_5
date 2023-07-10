def fib(n: Int): Int = n match {
  case 0           => 0
  case x if x == 1 => 1
  case _           => fib(n - 1) + fib(n - 2)
}
def getfib(n: Int): Unit = {
  if (n > 0) getfib(n - 1)
  println(fib(n))
}

@main def Main() = {

  getfib(5)
}
