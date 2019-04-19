import java.util.Date

object Log {
  def log(date : Date, message : String) = {
    println(date + "----" + message)
  }

  def main(args : Array[String]) : Unit = {
    val date = new Date
    log(date, "message1")
    log(date, "message2")
    log(date, "message3")
  } 
}
