package com.vigil.kata

class TennisGame(player1: Player, player2: Player) {

  def score: String = {
    if (player1.score >= 3 && player2.score >= 3) {
      if (Math.abs(player2.score - player1.score) >= 2) leadPlayer.name + " " + Score.won.toString
      else if (player1.score == player2.score) Score.deuce.toString
      else Score.advantage.toString + " " + leadPlayer.name
    } else player1.scoreDescription + ", " + player2.scoreDescription
  }

  def leadPlayer: Player = if (player1 > player2) player1 else player2

}

