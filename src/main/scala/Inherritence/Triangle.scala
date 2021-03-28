package Inherritence

class Triangle(var width :Double, var height :Double) extends Polgyon {
  override def area: Double = width * height/2;
}
