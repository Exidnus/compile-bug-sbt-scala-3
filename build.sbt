ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val lintFlags = Seq(
  "-Xfatal-warnings",
  "-print-lines",
  "-uniqid",
  "-Xprint-inline",
  "-Xprint-types",
  "-Yprint-pos",
  "-Yprint-pos-syms",
  "-Yprint-syms",
  "-Yshow-tree-ids",
  "-Yshow-var-bounds",
  "-Ydebug",
  "-Ydebug-flags",
  "-Ydebug-missing-refs",
  "-Ydebug-names",
  "-Ydebug-pos",
  "-Ydebug-trace",
  "-Yprint-debug",
  "-Yprint-debug-owners"
)

lazy val moduleSettings =
  Seq(
    scalaVersion       := "3.1.2-RC3",
    scalacOptions ++= lintFlags,
    Compile / doc / sources := Seq.empty,
    autoCompilerPlugins     := true
  )

lazy val a = project
  .in(file("modules/b"))
  .settings(moduleSettings)
  .settings(
    name := "cache4s",
    libraryDependencies ++= Dependencies.moduleDep,
    Test / parallelExecution := false,
    run / fork               := true,
    Test / fork              := true
  )

lazy val b = project
  .in(file("modules/a"))
  .settings(moduleSettings)
  .settings(
    name := "core-resource",
    libraryDependencies ++= Dependencies.moduleDep,
    Test / parallelExecution := false,
    run / fork               := true,
    Test / fork              := true
  )
