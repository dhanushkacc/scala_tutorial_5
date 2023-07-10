def GCD(a: Int, b: Int): Int = b match {
  case 0          => a
  case x if x > a => GCD(x, a)
  case _          => GCD(b, a % b)
}

def prime(p: Int, n: Int = 2): Boolean = n match {
  case x if x == p        => true
  case x if GCD(p, x) > 1 => false
  case x                  => prime(p, x + 1)
}

def primeSeq(n: Int, curr: Int = 2): Unit = {
  if (curr < n) {
    if (prime(curr)) {
      print(curr + " ")
    }
    primeSeq(n, curr + 1)
  }
}

@main def Main() = {

  println(prime(5))
  println(prime(8))
  primeSeq(10)
}
