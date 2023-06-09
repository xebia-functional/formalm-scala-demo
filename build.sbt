import Dependencies._

ThisBuild / scalaVersion     := "2.13.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "FormaLM Example",
    libraryDependencies += munit % Test,
    semanticdbEnabled := true, // necessary atm
    scalacOptions ++= List(
      "-Wunused" // necessary atm
    )
  )
