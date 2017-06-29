import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.sql.DriverManager
import java.sql.{Connection,DriverManager}


class DBConnectionClass {
  val user = "root"
  val pass = "admin"
  val url = "jdbc:mysql://172.16.40.5/scalatest"
  def readDataBase() = {
   try {
        Class.forName("com.mysql.jdbc.Driver")
        val connection: Connection = DriverManager.getConnection(url, user, pass);

   } 
   catch {
      case _: Throwable => println("Could not connect to database")
  } 

}
}

 object TestAppMain {
 def main(args: Array[String]){
    val DBconnObject = new DBConnectionClass
    DBconnObject.readDataBase
    println("Check DB Is connected or not")
}
}
