package Inherritence

class Polgyon{
  def area: Double=0.0;
}
object Inherritence {
  def main(args: Array[String]): Unit = {
    var poly = new Polgyon;
    printArea(poly)
    var react = new Rectangle(100.0,50.0);
    printArea(react)
    var tri = new Triangle(100.0,50.0);
    printArea(tri);
  }
  def printArea(p: Polgyon): Unit ={
    println(p.area);
  }

}
