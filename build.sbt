name := "play-sentry"

version := "1.0.0"

scalaVersion := "2.13.10"

libraryDependencies += guice
libraryDependencies += "io.sentry" % "sentry-logback" % "1.7.30"

lazy val root = (project in file(".")).enablePlugins(PlayJava)