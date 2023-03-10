// The simplest possible sbt build file is just one line:

scalaVersion := "2.13.8"

name := "refined-craziness"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1",
  "eu.timepit" %% "refined" % "0.10.0"
  // "eu.timepit" %% "refined" % "0.9.29"
)
