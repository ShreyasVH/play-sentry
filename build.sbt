name := "play-sentry"

version := "1.0.0"

scalaVersion := "3.8.4"

libraryDependencies += guice
libraryDependencies += "io.sentry" % "sentry-logback" % "8.43.2"

lazy val root = (project in file(".")).enablePlugins(PlayJava)