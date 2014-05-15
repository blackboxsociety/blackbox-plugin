import sbt._
import sbt.Keys._

import bintray.Plugin._
import bintray.Keys._

object Build extends Build {

  val customBintraySettings = bintrayPublishSettings ++ Seq(
    packageLabels in bintray       := Seq("framework", "web"),
    bintrayOrganization in bintray := Some("blackboxsociety"),
    repository in bintray          := "releases",
    publishMavenStyle              := false
  )

  val root = Project("root", file("."))
    .settings(customBintraySettings: _*)
    .settings(
      name         := "blackbox-plugin",
      organization := "com.blackboxsociety",
      scalaVersion := "2.11.0",
      sbtPlugin    := true,
      licenses     += ("MIT", url("http://opensource.org/licenses/MIT"))
    )

}