object GreetingsForEach {
  def main(args : List[String]) = {
    (1 to 3).foreach(i => print(i + ","))
    println("Scala Rocks!!!")
  }
}
