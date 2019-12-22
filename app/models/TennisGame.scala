package models

class TennisGame(player1: Player, player2: Player) {

  def score: String = {
    if (playersHaveMaxScores) {
      if (getScoreDiff >= 2) leadPlayer.name + " " + Score.won.toString
      else if (equalScores) Score.deuce.toString
      else Score.advantage.toString + " " + leadPlayer.name
    } else if (getScoreDiff > 3) leadPlayer.name + " " + Score.won.toString
      else if (leadPlayer.score > 3 && getScoreDiff >= 2) leadPlayer.name + " " + Score.won.toString
  else player1.scoreDescription + ", " + player2.scoreDescription
  }

  def leadPlayer: Player = if (player1 > player2) player1 else player2

  def getScoreDiff: Int = Math.abs(player2.score - player1.score)

  def equalScores: Boolean = player1.score == player2.score

  def playersHaveMaxScores : Boolean = player1.score >= 3 && player2.score >= 3

}


