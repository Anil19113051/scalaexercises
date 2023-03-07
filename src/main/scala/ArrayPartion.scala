object ArrayPartion {
  def main(args: Array [String])= {
    var myArr = Array(1, 2, 4, 5, 6, 7, 8, 9)
    var myarr2 = myArr.map((x) => {
      x + 2
    })
    var myarr3 = myArr.map(_ * 2)

    myarr2.foreach(print(_) + ",")
    println("\n")
    myarr3.foreach(print(_))

    var (even, odd) = myArr.partition((p) => {
      if (p % 2==0) {
        true
      } else {
        false
      }
    })
    val (even1, odd1) = myArr.partition(_ % 2 == 0)
    even1.foreach(println(_))
    odd1.foreach(println(_))
    }
  }