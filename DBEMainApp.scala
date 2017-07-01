package 
object DBEMainApp {
 def main(args: Array[String]){
    val configPath:String = args[2];
    DBEConfigManager.init(configPath) 
    val DBconnObject = new DBConnectionClass;
    val user:String=DBEConfigManager.getValue("CONFIG_DB_INFO").get("uid");
    val pass:String=DBEConfigManager.getValue("CONFIG_DB_INFO").get("pass");
    val url:String= DBEConfigManager.getValue("CONFIG_DB_INFO").get("url");
    DBconnObject.Init(puser=user, ppass=pass, purl=url);
  
    ProcessData(DBconnObject)
    
  
    println("Check DB Is connected or not")
}

def ProcessData():Bool = {
  // Create ORM for table DPE_ProcessData 
    // in that table  DATA_PATH VarChsar(500), // "/mywork/data/" Pattern VarChsar(50),
    
  // For each 
  
    //create spark context here 

}
