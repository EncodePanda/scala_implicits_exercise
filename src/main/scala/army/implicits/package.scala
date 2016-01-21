package army

package object implicits {


  implicit final class Barracks(armySize: Int) {
    def soldiers = this
    def recruit = (1 to armySize).toList.map{
      case idx: Int if(idx < 3) => Robot(100)
      case _ => Human(100)
    }
  }
}
