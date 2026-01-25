name := "play-sentry"

version := "1.0.0"

scalaVersion := "2.13.18"

libraryDependencies += guice
libraryDependencies += "io.sentry" % "sentry-logback" % "8.29.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)