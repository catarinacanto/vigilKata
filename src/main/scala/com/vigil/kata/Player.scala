package com.vigil.kata

class Player(val name: String) extends Ordered[Player] {
  val pointsDescription = Array(Score.love.toString, Score.fifteen.toString, Score.thirty.toString, Score.forty.toString)
  var score = 0
  def scoreDescription: String = pointsDescription(score)
  def compare(that: Player): Int = this.score - that.score
  def winBall() { score += 1}
}

object Player {
  def apply(name: String): Player = { new Player(name)}
}

