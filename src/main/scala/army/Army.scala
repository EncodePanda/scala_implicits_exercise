package army


sealed trait Soldier
case class Robot(battery: Int) extends Soldier
case class Human(life: Int, 
                 maybeRobot: Option[Robot] = None) extends Soldier

object Army extends App {

  import implicits._

  val army = 3.soldiers.recruit
  printArmy(army)

  // only robots
  // 5.robots.recruit

  // only humans
  // 10.soldiers.recruit

  // humans by default
  // 3.recruit


  def printArmy(army: List[Soldier]) = army.foreach(println)

}
