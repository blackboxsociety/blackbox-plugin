import bintray.Keys._

sbtPlugin := true

name := "blackbox-plugin"

organization := "com.blackboxsociety"

scalaVersion := "2.10.3"

publishMavenStyle := false

bintrayPublishSettings

repository in bintray := "sbt-plugins"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

bintrayOrganization in bintray := None

resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
  url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
    Resolver.ivyStylePatterns)

resolvers += "softprops-maven" at "http://dl.bintray.com/content/softprops/maven"

resolvers += "Black Box Society Repository" at "http://dl.bintray.com/blackboxsociety/releases"

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.1")

addSbtPlugin("me.lessis" % "less-sbt" % "0.2.2")

addSbtPlugin("org.scala-sbt" % "sbt-closure" % "0.1.4")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2")

libraryDependencies += "com.blackboxsociety" %% "blackbox" % "0.1.0"
