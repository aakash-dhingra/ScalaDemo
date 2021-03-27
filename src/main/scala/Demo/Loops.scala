package Demo

object Loops {
  def main(args: Array[String]): Unit ={
    //while
    var x=0
    while(x<3){
      println(x)
      x+=1
    }

    //for loop
    for( i<-1 to 5) {
      println(i)
    }

    //nested loop
     for(j<-1.to(3);k<-1.to(3)){
       println(j,k)
     }
  }

}
