package Demo

object AnonymosFunction {
  var add=(x :Int, y :Int)=>x+y

  def main(args: Array[String]): Unit = {
    println(add(1, 2))
  }
}
