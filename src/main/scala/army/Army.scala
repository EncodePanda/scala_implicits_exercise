package army


sealed trait Soldier
case class Robot(battery: Int) extends Soldier
case class Human(life: Int, 
                 maybeRobot: Option[Robot] = None) extends Soldier

object Army extends App {

  import implicits._

  val army = 3.soldiers.recruit
  printArmy(army)


  def printArmy(army: List[Soldier]) = army.foreach(println)

}
