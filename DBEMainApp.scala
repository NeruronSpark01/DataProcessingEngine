package 
object DBEMainApp {
 def main(args: Array[String]){
    val configPath:String = args[2];
    DBEConfigManager.init(configPath) 
 
    ProcessData(DBconnObject)
    
  
    println("Check DB Is connected or not")
}

def ProcessFiles(pathName:String, dbcon:DBConnectionClass,  sparkContext:):Bool = {
 // Read all the files from that path using scala directory function 
 // You will get containers with with filenames 
 
 // For each file open that file on spark context
 // Calculate MD5 hash  
 //  Get the count of lines & print it 
 // Update this table with MD5 
 True  
 // exception Handleing  return 
 False
}
 
def ProcessData(DBconnObjectDBEDBConnectionClass ):Bool = {
    val DBconnObject = new DBConnectionClass;
    val user:String=DBEConfigManager.getValue("CONFIG_DB_INFO").get("uid");
    val pass:String=DBEConfigManager.getValue("CONFIG_DB_INFO").get("pass");
    val url:String= DBEConfigManager.getValue("CONFIG_DB_INFO").get("url");
    DBconnObject.Init(puser=user, ppass=pass, purl=url);
    // Create a sparkContext here 
 
    // Create ORM for table DPE_ProcessData 
    // for example http://sorm-framework.org/
     // in that table  DATA_PATH VarChsar(500), // "/mywork/data/" Pattern VarChsar(50),
    
    // For each DATA_PATH
    ProcessFiles()
    //create spark context here 

}
