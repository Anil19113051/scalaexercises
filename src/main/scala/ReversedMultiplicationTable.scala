import scala.io.StdIn.readInt

object ReversedMultiplicationTable {
  def main(args: Array[String]): Unit = {
    println("Please enter the table number: ")
    val num=readInt()
    for (i <- 10 to 1 by -1) {
      if (i != 7) {

        println(num + " x " + i + " = " + (num * i))
        }
      }
    }
}
