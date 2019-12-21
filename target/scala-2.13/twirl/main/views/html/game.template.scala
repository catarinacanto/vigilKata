
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
/*1.2*/import scala.collection.mutable.ListBuffer

object game extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,ListBuffer[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(player1: String, player2: String, game : ListBuffer[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Tennis Game")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""

    """),format.raw/*6.5*/("""<ul>
        <p>Hello """),_display_(/*7.19*/player1),format.raw/*7.26*/(""" """),format.raw/*7.27*/("""and """),_display_(/*7.32*/player2),format.raw/*7.39*/("""!</p>
    </ul>

    <ul>
    """),_display_(/*11.6*/for(i <- 0 until game.length) yield /*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
        """),format.raw/*12.9*/("""<p>"""),_display_(/*12.13*/game(i)),format.raw/*12.20*/("""</p>
    """)))}),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""</ul>

    <p class="buttons">
        <a href=""""),_display_(/*17.19*/routes/*17.25*/.HomeController.index),format.raw/*17.46*/("""">Back</a>
    </p>

""")))}))
      }
    }
  }

  def render(player1:String,player2:String,game:ListBuffer[String]): play.twirl.api.HtmlFormat.Appendable = apply(player1,player2,game)

  def f:((String,String,ListBuffer[String]) => play.twirl.api.HtmlFormat.Appendable) = (player1,player2,game) => apply(player1,player2,game)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-21T20:48:35.004279
                  SOURCE: /Users/macbookpro/Documents/Kata/vigilKata/app/views/game.scala.html
                  HASH: 7bbae459b03a3cec7069f6f03fdea2172cd430c4
                  MATRIX: 432->1|804->45|959->107|986->109|1013->128|1052->130|1084->136|1133->159|1160->166|1188->167|1219->172|1246->179|1303->210|1348->239|1388->241|1424->250|1455->254|1483->261|1523->271|1555->276|1631->325|1646->331|1688->352
                  LINES: 17->1|22->2|27->3|28->4|28->4|28->4|30->6|31->7|31->7|31->7|31->7|31->7|35->11|35->11|35->11|36->12|36->12|36->12|37->13|38->14|41->17|41->17|41->17
                  -- GENERATED --
              */
          