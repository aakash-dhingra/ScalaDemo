package Demo

object HigherOrderFunc {
  def math(x :Double,y :Double,f:(Double,Double)=>Double) :Double = f(x,y)

  def main(args: Array[String]): Unit = {
    var result1 = math(50,20,(x,y)=>x+y)
    var result2 = math(50,20,(x,y)=>x-y)
    var result3 = math(50,20,(x,y)=>x*y)
    var result4 = math(50,20,(x,y)=>x/y)
    println(result1)
    println(result2)
    println(result3)
    println(result4)
  }

}
