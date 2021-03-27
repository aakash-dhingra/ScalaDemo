import java.util.Date;
package Demo {

  object PartialOrderFunc {
    def log(date: Date, message: String): Unit = {
      println(date + " -------->" + message)
    }

    def main(args: Array[String]): Unit = {
      var date = new Date()
      var newLog = log(date, _: String)
      newLog("Task is to Learn Scala Now")
      newLog("Task is to Practice data structures")
    }
  }

}