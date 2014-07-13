
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play Framework")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""

    """),_display_(/*5.6*/play20/*5.12*/.welcome(message)),format.raw/*5.29*/("""

""")))}),format.raw/*7.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jul 13 05:14:05 IST 2014
                  SOURCE: /Users/abhisheu/my-first-app/app/views/index.scala.html
                  HASH: ec9c71ab162b7a3871d2d71c4b71690b8872616f
                  MATRIX: 505->1|610->18|638->21|679->54|718->56|750->63|764->69|801->86|833->89
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5|28->7
                  -- GENERATED --
              */
          