import Dependencies._

lazy val root: Project = (project in file("."))
  .settings(
    name := "scala-steward-test"
  )
  .aggregate(testProject)

lazy val testProject = (project in file("test-project"))
  .settings(
    name := "test-project"
  )
  .settings(
    libraryDependencies ++= Seq(
      "software.amazon.awssdk" % "dynamodb" % "2.17.100",
      "software.amazon.awssdk" % "sqs" % "2.17.100", // scala-steward: off
      Elasticache.elasticache,
      Kinesis.kinesis,
    )
  )
