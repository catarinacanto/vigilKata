package controllers

import com.google.inject.Inject
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import services.TennisGameService
import views.html

import scala.collection.mutable.ListBuffer


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
class HomeController @Inject()(messagesAction: MessagesActionBuilder, components: ControllerComponents)
  extends AbstractController(components) {

  val playerForm = Form(
    tuple(
      "player1" -> nonEmptyText,
      "player2" -> nonEmptyText,
    )
  )

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  /**
   * Home page
   */
  def index: Action[AnyContent] = messagesAction { implicit request: MessagesRequest[AnyContent] =>
    Ok(views.html.index(playerForm))
  }

  def post: Action[AnyContent] = TODO

  def play: Action[AnyContent] = messagesAction { implicit request: MessagesRequest[AnyContent] =>
    playerForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.index(formWithErrors)),
      { case (player1, player2) =>
        val game = new TennisGameService
        Ok(html.game(player1, player2, game.execute(player1, player2)))
      }
    )
  }

}
