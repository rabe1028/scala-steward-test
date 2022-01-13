import sbt._

object Version {
  // scala-steward:off
  val aws = "2.17.100"
  // scala-steward:on
}

object Dependencies {
  // scala-steward:off
  object Elasticache {
    val version = "2.17.100"
    val elasticache = "software.amazon.awssdk" % "elasticache" % version
  }
  // scala-steward:on

  object Kinesis {
    val kinesis = "software.amazon.awssdk" % "kinesis" % Version.aws
  }
}