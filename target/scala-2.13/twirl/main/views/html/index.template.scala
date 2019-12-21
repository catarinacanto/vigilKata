
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[scala.Tuple2[String, String]],RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(playerForm: Form[(String, String)])(implicit request: RequestHeader, messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main(title = "Tennis Game")/*4.29*/ {_display_(Seq[Any](format.raw/*4.31*/("""

    """),format.raw/*6.5*/("""<h1>Choose Players For Tennis Game:</h1>

    """),_display_(/*8.6*/form(action = routes.HomeController.play(), args = Symbol("id") -> "playerForm")/*8.86*/ {_display_(Seq[Any](format.raw/*8.88*/("""

        """),_display_(/*10.10*/inputText(
            field = playerForm("player1"),
            args = Symbol("_label") -> "Player 1 name", Symbol("placeholder") -> "Player 1"
        )),format.raw/*13.10*/("""

        """),_display_(/*15.10*/inputText(
            field = playerForm("player2"),
            args = Symbol("_label") -> "Player 2 name", Symbol("placeholder") -> "Player 2"
        )),format.raw/*18.10*/("""


        """),format.raw/*21.9*/("""<p class="buttons">
            <input type="submit" id="submit">
         <p>

    """)))}),format.raw/*25.6*/("""

""")))}),format.raw/*27.2*/("""
"""))
      }
    }
  }

  def render(playerForm:Form[scala.Tuple2[String, String]],request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(playerForm)(request,messagesProvider)

  def f:((Form[scala.Tuple2[String, String]]) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (playerForm) => (request,messagesProvider) => apply(playerForm)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-21T20:48:35.021218
                  SOURCE: /Users/macbookpro/Documents/Kata/vigilKata/app/views/index.scala.html
                  HASH: d2f9b9434667401c8069905b5034110dd6e913ec
                  MATRIX: 788->1|966->108|1010->124|1037->126|1072->153|1111->155|1143->161|1215->208|1303->288|1342->290|1380->301|1556->456|1594->467|1770->622|1808->633|1923->718|1956->721
                  LINES: 21->1|24->2|27->3|28->4|28->4|28->4|30->6|32->8|32->8|32->8|34->10|37->13|39->15|42->18|45->21|49->25|51->27
                  -- GENERATED --
              */
          