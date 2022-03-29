import sbt._

object Dependencies {
  object V {
    val cats = "2.7.0"
    val catsFree = "2.7.0"
    val catsEffect = "3.3.5"
  }

  object Compile {
    val catsCore = "org.typelevel"   %% "cats-core"   % V.cats
    val catsEffect = "org.typelevel" %% "cats-effect" % V.catsEffect
  }

  val moduleDep: Seq[ModuleID] = Seq(
    Compile.catsCore,
    Compile.catsEffect
  )
}
