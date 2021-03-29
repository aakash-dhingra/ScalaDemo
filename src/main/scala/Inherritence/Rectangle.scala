package Inherritence

class Rectangle(var width :Double, var height :Double) extends Polgyon with Shape {
  override def area: Double = width * height;

  override def color: String = "red";
}
