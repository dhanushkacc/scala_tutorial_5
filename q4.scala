def CheckEven(n: Int): Boolean = n match {
  case 0 => true
  case 1 => false
  case _ => CheckEven(n - 2)
}

@main def Main() = {

  println(CheckEven(6))
  println(CheckEven(5))
}
