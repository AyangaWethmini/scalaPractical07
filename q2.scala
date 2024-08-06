object Q2 extends App {
  // def squareNumbers(numbers: Array[Int]): Array[Int] = {
  //   numbers.map(n => n * n)
  // }

  def squareNumbers: Array[Int] => Array[Int] = numbers =>
    numbers.map(i => i * i)

  val numArray = Array(1, 2, 3, 4, 5)

  println("Squared numbers : " + squareNumbers(numArray).mkString(", "))
}
