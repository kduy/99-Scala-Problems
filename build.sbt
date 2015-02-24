name := "s99"

version := "1.0"

scalaVersion := "2.10.4"

//libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

libraryDependencies ++=Seq(
  "org.scalatest" % "scalatest_2.9.2" % "1.8" % "test" withSources()
    withJavadoc(),
  "joda-time" % "joda-time" % "1.6.2" withSources() withJavadoc(),
  "junit" % "junit" % "4.10" withSources() withJavadoc(),
  "org.testng" % "testng" % "6.1.1" % "test" withSources() withJavadoc(),
  "org.specs2"    %% "specs2-core"   % "2.4.15" withSources() withJavadoc()
)