import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.sql.DriverManager
import java.sql.{Connection,DriverManager}


class DBEDBConnectionClass {
  var user = "root"
  var pass = "admin"
  var url = "jdbc:mysql://172.16.40.5/scalatest"
  def Init(puser:String, ppass:String, purl:String) {
    this.user=puser;
    this.pass=puser;
    this.url = purl;
  } 
  
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

