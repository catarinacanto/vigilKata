package services

import models.{Player, TennisGame}

import scala.collection.mutable.ListBuffer

class TennisGameService {

  def execute(player1: String, player2: String): ListBuffer[String] = {
    val firstPlayer = Player(player1)
    val secondPlayer = Player(player2)
    val game = new TennisGame(firstPlayer, secondPlayer)
    val gameScore = new ListBuffer[String]

    while (!game.score.contains("won")) {
      if (getRandomNumber % 2 == 0) gameScore += firstPlayer.winBall else gameScore += secondPlayer.winBall
      gameScore += game.score
    }
    gameScore
  }

  def getRandomNumber: Int = {
    val random = new scala.util.Random
    val start = 0
    val end = 100
    start + random.nextInt((end - start) + 1)
  }
}
