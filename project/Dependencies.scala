import sbt._

object Version {
  val aws = "2.17.100"
}

object Dependencies {
  object Elasticache {
    val version = "2.17.100"
    val elasticache = "software.amazon.awssdk" % "elasticache" % version
  }

  object Kinesis {
    val kinesis = "software.amazon.awssdk" % "kinesis" % Version.aws
  }
}