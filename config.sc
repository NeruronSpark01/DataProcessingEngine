import scala.io.Source

object DBEConfigManager {
 var config=scala.collection.immutable.Map[String, Any]()
  def init(configFilePath:String)  {
    val configString = Source.fromFile(configFilePath).getLines.mkString
    config = scala.util.parsing.json.JSON.parseFull( configString ).get.asInstanceOf[Map[String,Any]]
  }  
  def getValue(key:String):Any = {
   config.getOrElse(key, null)
 }
}

