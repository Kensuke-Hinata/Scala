class Complex0(val real : Int, val imaginary : Int) {
  def +(operand : Complex0) : Complex0 = {
    new Complex0(real + operand.real, imaginary + operand.imaginary)
  }

  override def toString() : String = {
    real + (if (imaginary < 0) "" else "+") + imaginary + "i"
  }
}

object Complex0 {
  def main(args : Array[String]) = {
    val c0 = new Complex0(1, 2)
    val c1 = new Complex0(2, -3)
    val sum = c0 + c1
    println("(" + c0 + ") + (" + c1 + ") = " + sum)
  }
}
