package 
object DBEMainApp {
 def main(args: Array[String]){
    val DBconnObject = new DBConnectionClass
    DBconnObject.readDataBase
    println("Check DB Is connected or not")
}
}
