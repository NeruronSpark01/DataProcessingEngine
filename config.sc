import scala.io.Source

object conf extends App {

  val input = """rawIngestionTableName=rawdataingestion
enrichedDataTableName=enricheddataingestion
rulesOutputDataTableName=rulesoutput
Ip=localhost
database=abc"""

    // val input = Source.fromFile("/path/to/file.conf").mkString("\n")

  val conf = input.split("\n").map(_.split("=", 2)).map(p => (p(0) -> p(1))).toMap

  println(conf("database")) // outputs "abc"

}
