package Demo

object BasicOps {
  def main(args: Array[String]): Unit ={
    var name="Mark"
    var age=18
    println(name + " is " + age + " years old")

    //"s" Interpollation
    println(s"$name is $age years old")

    //"f" Interpollation
    println(f"$name%s is $age%d years old")

    //Raw String
    println("Hello \nWorld")
    println(raw"Hello \n World")
  }
}
