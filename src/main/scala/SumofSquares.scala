object SumOfSquares {
  def Calculator(a:Int,b:Int,func:(Int)=>Int):Int=func(a)+func(b)
  def main(args:Array[String]):Unit= {
    var c = Calculator(10, 20, square)
    var c1 = Calculator(10, 20, cube)
    var c3 = Calculator(10, 30, (x: Int) => x * x * x * x)
    println(c)
    println(c1)
    println(s"$c3")
  }
  def square(a:Int):Int=(a*a);
  def cube(a:Int):Int=(a*a*a)
}