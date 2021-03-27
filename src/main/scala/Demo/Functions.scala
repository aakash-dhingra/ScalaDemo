package Demo

object Functions {
  def add(x: Int,y :Int) :Int={
    return x+y
  }
  def add1(x :Int= 40,y :Int = 50)=x+y
  def main(args: Array[String]): Unit = {
    println(add(3,4))//7
    println(add1(10))//60
  }
}
