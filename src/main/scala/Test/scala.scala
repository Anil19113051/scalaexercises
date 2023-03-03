import scala.io.StdIn.readInt

object WhileDemo{
  def main(args:Array[String])={
    var i=10;
    while(true)
    {
      println("Please enter your choice : ")
      println("1.add 2.sub 3.divide 4.multiplication")
      var choice=readInt()
      println("Please enter a value")
      var a = readInt()
      println("Please enter b value")
      var b = readInt()
      choice match {
        case 1 => println(a+b)
        case 2 => println(a-b)
        case 3 => println(a/b)
        case 4 => println(a*b)
        case _ => println("Invalid Input")

      }



      }
    }
}