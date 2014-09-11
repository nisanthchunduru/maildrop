name := "common"

version := "2.0"

scalaVersion := "2.11.2"

resolvers ++= Seq(
	"rediscala" at "http://dl.bintray.com/etaty/maven",
	"Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
	"com.typesafe" % "config" % "1.2.1",
	"com.typesafe.akka" % "akka-actor_2.11" % "2.3.6",
	"com.etaty.rediscala" %% "rediscala" % "1.3.1",
	"com.typesafe.play" %% "play-json" % "2.3.4"
)