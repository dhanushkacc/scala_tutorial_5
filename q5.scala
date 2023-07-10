def EvenSum(n: Int): Int = {
  if (n <= 0) {
    0
  } else {
    val temp = if (n % 2 == 0) n else n - 1
    temp + EvenSum(temp - 2)
  }
}

@main def Main() = {

  println(EvenSum(7))
}
