object StringInterpolation {
  def main(args: Array[String]): Unit = {
    var x=10
    println(s"the value of x is $x")
    var y=2.2
    var z=s"this is the value $x"
    println(z)
    println(f"this is string $y%.20f $z%S")
    println(raw"the value \n of x is $x")
    println(s"the value$$e of x is $x")


    println(s"the value of xis:"+x)

    }

}
