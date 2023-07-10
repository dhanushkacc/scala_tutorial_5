def sum(n: Int): Int = n match {
  case 1 => 1
  case _ => n + sum(n - 1)

}
@main def Main() = {

  println(sum(5))
}
