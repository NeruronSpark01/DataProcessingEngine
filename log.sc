name := "SLF4JTest"
version := "1.0"
scalaVersion := "2.10.0"
libraryDependencies ++= Seq("org.slf4j" % "slf4j-api" % "1.7.5",   "org.slf4j" % "slf4j-simple" % "1.7.5")
import org.slf4j.Logger
import org.slf4j.LoggerFactory
class Pizza {
  val logger = LoggerFactory.getLogger(classOf[Pizza])
  logger.info("Hello from the Pizza class")
}
object Main extends App {
  val p = new Pizza
}
