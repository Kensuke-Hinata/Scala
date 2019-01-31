package Vehicle {
  class Vehicle(val id : Int, val year : Int) {
    override def toString() : String = "ID: " + id + " Year: " + year
  }

  class Car(override val id : Int, override val year : Int,
    var fuelLevel : Int) extends Vehicle(id, year) {
      override def toString() : String = {
        super.toString() + " Fuel Level: " + fuelLevel
      }
  }

  object Vehicle {
    def main(args : Array[String]) : Unit = {
      val car = new Car(1, 2019, 100)
      println(car)
    } 
  }
}
