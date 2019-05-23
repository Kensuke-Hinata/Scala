class Human(val name : String) {
  def listen() = println("Your friend " + name + " is listening")
}

class Man(override val name : String) extends Human(name)
class Woman(override val name : String) extends Human(name)
