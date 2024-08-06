object Q1 extends App {
  // def filterEvenNumbers(numbers: Array[Int]): Array[Int] = {
  //   numbers.filter(i => i % 2 == 0)
  // }

  def filterEvenNumbers: Array[Int] => Array[Int] = numbers =>
    numbers.filter(i => i % 2 == 0)

  val numArray = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  println("Even Numbers : " + filterEvenNumbers(numArray).mkString(", "))
}
