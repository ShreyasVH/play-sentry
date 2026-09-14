name := "play-sentry"

version := "1.0.0"

scalaVersion := "3.9.0"

libraryDependencies += guice
libraryDependencies += "io.sentry" % "sentry-logback" % "8.56.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)