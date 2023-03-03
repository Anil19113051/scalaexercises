object MultiplicationTable {
  def main(args: Array[String]) {
    for (i <- 1 to 10) {
      if (i == 5) { // skip the fifth row
        println()
      } else {
        for (j <- 1 to 10) {
          if (j == 6) { // skip the sixth column
            print("\t")
          } else {
            print(i*j + "\t")
          }
        }
        println()
        }
      }
    }
}