name := "play-sentry"

version := "1.0.0"

scalaVersion := "3.8.2"

libraryDependencies += guice
libraryDependencies += "io.sentry" % "sentry-logback" % "8.35.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)