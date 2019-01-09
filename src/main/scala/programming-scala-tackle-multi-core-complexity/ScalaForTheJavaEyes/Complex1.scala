class Complex1(val real : Int, val imaginary : Int) {
  def +(operand : Complex1) : Complex1 = {
    println("Calling +")
    new Complex1(real + operand.real, imaginary + operand.imaginary)
  }

  def *(operand : Complex1) : Complex1 = {
    println("Calling *")
    new Complex1(real * operand.real - imaginary * operand.imaginary,
      real * operand.imaginary + imaginary * operand.real)
  }

  override def toString() : String = {
    real + (if (imaginary < 0) "" else "+") + imaginary + "i"
  }
}

object Complex1 {
  def main(args : Array[String]) = {
    val c0 = new Complex1(1, 4)
    val c1 = new Complex1(2, -3)
    val c2 = new Complex1(2, 2)
    println(c0 + c1 * c2)
  }
}
