name := "SLF4JTest"
version := "1.0"
scalaVersion := "2.10.0"
libraryDependencies ++= Seq("org.slf4j" % "slf4j-api" % "1.7.5",   "org.slf4j" % "slf4j-simple" % "1.7.5")
import org.slf4j.Logger
import org.slf4j.LoggerFactory
class DPELogger {
  val logger = LoggerFactory.getLogger(classOf[DPELogger])
  logger.info("Hello from the DPELogger class")
}
object Main extends App {
  val p = new DPELogger
}
