package SearchAlgo

object LinearSearch {

  def linear(arr : Array[Int],x:Int):(Int,Int) ={
    var result=0;
    var index = 0;
    for(i<- 0 to arr.length - 1) {
      if(arr(i)==x) {
        result = arr(i);
        index = i;
      }
    }
    (result,index)
  }

  def main(args: Array[String]): Unit = {
    var arr =Array(1,2,3,4,5,6,7,8,9);
    var search = linear(arr,3);
    println("element "+ search._1 + " is found at " + search._2);
  }

}
