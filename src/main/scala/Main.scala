import eu.timepit.refined._
import eu.timepit.refined.api.{Refined, RefinedTypeOps}
import eu.timepit.refined.boolean.Or
import eu.timepit.refined.generic.Equal
import eu.timepit.refined.numeric.Greater

object Main extends App {
  type Crazy = Int Refined (Greater[5] Or Equal[5])
  object Crazy extends RefinedTypeOps.Numeric[Crazy, Int]

  // val crazy = Crazy.unsafeFrom(5)
  val sane: Crazy = refineV[Greater[5] Or Equal[5]](5).toOption.get
  val sane2: Crazy = refineMV[Greater[5] Or Equal[5]](5)
  println("Hello, World!")
}
