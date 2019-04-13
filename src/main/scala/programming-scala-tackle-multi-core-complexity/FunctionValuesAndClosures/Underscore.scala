object Underscore {
  def main(args : Array[String]) : Unit = {
    val arr = Array(1, 2, 3, 4, 5)

    println("Sum of all values in array is " + 
      (0 /: arr) { _ + _ })
  }
}
