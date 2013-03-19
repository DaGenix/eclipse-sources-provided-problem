name := "eclipse-sources-provided-problem"

organization := "com.palmercox"

version := "1.0"

scalaVersion := "2.10.0"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

EclipseKeys.withSource := true

// The sources for this library won't be linked if "provided" is used. However, if
// you switch that to "compile" they will.
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.1.0" % "provided"

