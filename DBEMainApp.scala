package 
object DBEMainApp {
 def main(args: Array[String]){
    val configPath:String = args[2];
    DBEConfigManager.init(configPath) 
    val DBconnObject = new DBConnectionClass
    val user:String=DBEConfigManager.getValue("CONFIG_DB_INFO").get("uid")
    val pass:String=DBEConfigManager.getValue("CONFIG_DB_INFO").get("pass")
    DBconnObject.readDataBase(user=user, pass=pass)
    println("Check DB Is connected or not")
}
}
