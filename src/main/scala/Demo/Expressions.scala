package Demo

object Expressions {
  def main(args: Array[String]): Unit ={
    var age =19
    if(age<18) {
      println("Not Eligible")
    }
    else{
      println("You are Eligible")
    }
  }

  //Match
  val num = 40
  num match{
    case 20 => println(num)
    case 30 => println(num)
    case 50=> println(num)
    case _ => println("Default")
  }
}
