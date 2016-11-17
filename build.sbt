import sbt._
import Dependencies._

organization := "org.example"
name := "sbt-base"
version := "0.0.1-SNAPSHOT"
scalaVersion in ThisBuild := "2.11.8"

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

resolvers in ThisBuild ++= Seq( "Sonatype releases" at "https://oss.sonatype.org/content/repositories/releases",
                                "Spray IO Repository" at "http://repo.spray.io/",
                                "Maven Central" at "https://repo1.maven.org/maven2/" )

lazy val root = ( project in file( "." ) )

// placeholder for child modules
lazy val child = ( project in file( "child" ) ).settings( libraryDependencies ++= Seq() )

