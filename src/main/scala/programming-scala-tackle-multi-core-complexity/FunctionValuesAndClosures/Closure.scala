object Closure {
  def loopThrough(number : Int)(closure : Int => Unit) = {
    for (i <- 1 to number) {
      closure(i)
    }
  }

  def main(args: Array[String]) : Unit = {
    var result = 0
    val addIt = {
      value : Int => result += value
    }

    loopThrough(10) { addIt }
    println("Total of values from 1 to 10 is " + result)
  } 
}
