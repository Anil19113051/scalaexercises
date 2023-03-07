import scala.io.StdIn.{readInt, readLine}

object student {
  var students:Array[String]=new Array[String](10)
  var i=0;
  def addstudent() ={
    println("please enter the name")
    var sname=readLine()
    students(i)=sname
    i=i+1
  }
  def listStudent()= {
    println("student name")
    println("    ")
    for (k <- 0 to i - 1) {
      println(students(k))
    }
  }
  def main(args:Array[String])={
    while(true) {
      println("please choose ")
      println("1. add students \t 2. list student")
      var ch:Int=readInt()
      ch match {
        case 1=> addstudent()
        case 2 =>listStudent()
        case _=>println (s"invalid option")

      }
    }


  }


}
