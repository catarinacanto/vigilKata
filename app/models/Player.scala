package models

case class Player(name: String) extends Ordered[Player] {
  val pointsDescription = Array(Score.love.toString, Score.fifteen.toString, Score.thirty.toString, Score.forty.toString)
  var score = 0
  var win: String = name + " wins ball"
  var numberOfWins = 0
  def scoreDescription: String = pointsDescription(score)
  def compare(that: Player): Int = this.score - that.score
  def winBall(): String = {
    score += 1
    win
  }
}

object Player {
  def apply(name: String): Player = {
    new Player(name)
  }
}




