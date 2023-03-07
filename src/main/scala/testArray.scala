object testArray{
  def main(args: Array[String])={
    var v =Array(1,2,5,6,78,50)
    v.foreach(n=>{
      if (n>=50){
        println("five")
      }else{
        println
      }
    })
    v.foreach(n=>println(n))
    v.foreach(println(_))
    }


}