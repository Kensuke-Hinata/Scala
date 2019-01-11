object AnotherMultiLine {
  def main(args : Array[String]) = {
    val str = """
    | hi
    | hello
    | hey
    """.stripMargin
    println(str)
  }
}
