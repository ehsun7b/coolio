scalaVersion := "3.2.2"

enablePlugins(ScalaNativePlugin)

// set to Debug for compilation details (Info is default)
logLevel := Level.Info

// import to add Scala Native options
import scala.scalanative.build._

// defaults set with common options shown
nativeConfig ~= { c =>
  c.withLTO(LTO.none) // thin
    .withMode(Mode.debug) // releaseFast
    .withGC(GC.immix) // commix
    .withLinkingOptions(c.linkingOptions :+ "-L/usr/local/opt/openssl@3/lib")
}

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaNativePlugin)
  .settings(
    name := "coolio",
    libraryDependencies += "org.typelevel" %%% "cats-effect" % "3.4.8",
    libraryDependencies += "com.github.lolgab" %%% "scala-native-crypto" % "0.0.4",
    Compile / mainClass := Some("ehsun7b.coolio.Main")
  )
