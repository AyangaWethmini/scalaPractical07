object Q2 extends App {

  // def filterPrime(numbers: Array[Int] => (numbers.filter(x => !((2 until x - 1) exists (x % _ == 0)) && x > 1)))


  def filterPrime : Array[Int] => Array[Int] = numbers => numbers.filter(x => !((2 until x - 1) exists (x % _ == 0)) && x > 1)


  val numArray = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

  println("prime numbers : " + filterPrime(numArray).mkString(", "))
} 
