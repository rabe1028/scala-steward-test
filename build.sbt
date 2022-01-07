

lazy val root: Project = (project in file("."))
  .settings(
    name := "scala-steward-test"
  )
  .aggregate(testProject)

lazy val testProject = (project in file("test-project"))
  .settings(
    name := "test-project"
  )
