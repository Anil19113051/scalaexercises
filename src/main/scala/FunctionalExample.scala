object FunctionExample {

  def main(args: Array[String]): Unit = {
    var result = sum(10, 20)
    println(result)
    println(findFactorial(5))
  }

  def sum(a: Int, b: Int): Int = {
    var sum = a + b
    sum
  }

  def findFactorial(v: Int): Int = {
    if (v <= 1) 1 else v * findFactorial(v - 1)

    }




}