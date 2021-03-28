package SearchAlgo

object BinarySearch {
  def binary(arr: Array[Int],x:Int, start :Int,end :Int) :Int ={

    var mid =  start + (end -  start) /2;
    var index = 0;
    if(arr(mid) == x) {
      return mid;
    } else if(arr(mid) > x) {
      return binary(arr, x, start, (mid-1));
    }else {
      return binary(arr, x, (mid+1) , end);
    }
  }

  def main(args: Array[String]): Unit = {
    var arr =Array(1,2,3,4,5,6,7,8,9);
    var start = 0;
    var end = arr.length - 1;
    var element = 6;
    var elementIndex = binary(arr,element,start,end);
    println(s"element $element is found at index $elementIndex")
  }
}
