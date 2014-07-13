
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
object hello extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.at("javascripts/jquery-2.1.1.min.js")),format.raw/*2.66*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*3.15*/routes/*3.21*/.Assets.at("javascripts/reveal.js")),format.raw/*3.56*/("""" type="text/javascript"></script>
<script>
    
$(document).ready(function()"""),format.raw/*6.29*/("""{"""),format.raw/*6.30*/("""
    """),format.raw/*7.5*/("""$("#animebtn").click(function()"""),format.raw/*7.36*/("""{"""),format.raw/*7.37*/("""
     
        """),format.raw/*9.9*/("""$("#content").slideToggle();
    """),format.raw/*10.5*/("""}"""),format.raw/*10.6*/(""");
        
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/(""");
    </script>
<style>
    #headerr
    """),format.raw/*16.5*/("""{"""),format.raw/*16.6*/("""
        """),format.raw/*17.9*/("""background-color:LIGHTGREEN;
        padding:1%;
    """),format.raw/*19.5*/("""}"""),format.raw/*19.6*/("""
    """),format.raw/*20.5*/("""body
    """),format.raw/*21.5*/("""{"""),format.raw/*21.6*/("""
        """),format.raw/*22.9*/("""background-color:WHITE;
    """),format.raw/*23.5*/("""}"""),format.raw/*23.6*/("""
    """),format.raw/*24.5*/("""</style>
<link rel="stylesheet" media="screen" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" media="screen" href=""""),_display_(/*26.46*/routes/*26.52*/.Assets.at("stylesheets/listAnimation.css")),format.raw/*26.95*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*27.46*/routes/*27.52*/.Assets.at("stylesheets/reveal.css")),format.raw/*27.88*/("""">
<link rel="stylesheet" href=""""),_display_(/*28.31*/routes/*28.37*/.Assets.at("stylesheets/default.css")),format.raw/*28.74*/("""" id="theme">

<div class="page-header" id="headerr">
    <center>
<h1> Box Office <small> Redifined..</small></h1>
</center>
        </div>
<center>
<div class="btn-group">
<button id="animebtn" type="button" class="btn btn-primary">About the App</button>
<button id="animebtn1" type="button" class="btn btn-primary">Explore</button>
<button id="animebtn2" type="button" class="btn btn-primary">Feedback</button>
</div>
</center>
<div id="content">
<div class="reveal">
<div class="slides">
    <section>
					
					<h3>We are Fabulous</h3>
					<p>
						<h4>Created by</h4><small><a href="http://www.facebook.com/pure25">Abhishek</a> / <a href="http://www.facebook.com/pure25">abhi</a></small>
					</p>
</section>
<section>
					<h2>Here You Are.</h2>
					<p>
						This is a WebApp for MovieBuffs
					</p>

					<aside class="notes">
						Oh hey, these are some notes. They'll be hidden in your presentation, but you can see them if you open the speaker notes window (hit 's' on your keyboard).
					</aside>
				</section>

<section>
					<h2>All about the movies</h2>
					<p>
						Suggestions by moods,genre and much more...
					</p>

					<aside class="notes">
						Oh hey, these are some notes. They'll be hidden in your presentation, but you can see them if you open the speaker notes window (hit 's' on your keyboard).
					</aside>
				</section>

<section>
					<h2>Cool Isnt it?</h2>
					<p>
						So, check out the Website and Provide Feedback
                        <button class="btn btn-success" type="button">Start Here</button>
					</p>

					<aside class="notes">
						Oh hey, these are some notes. They'll be hidden in your presentation, but you can see them if you open the speaker notes window (hit 's' on your keyboard).
					</aside>
				</section>
</div>
    </div>
<ul id="animation" style="display:none;">
    <table>
        
    <tr><td><li>one</li><li>two</li><li>three</li><li>four</li></td></tr>
    
</ul>
</div>    

<script>
    Reveal.initialize([])
    </script>


"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Jul 13 05:14:05 IST 2014
                  SOURCE: /Users/abhisheu/my-first-app/app/views/hello.scala.html
                  HASH: c875f68d872dc518dfc0b4866f9a464f8d9babbc
                  MATRIX: 505->1|610->18|637->19|677->33|691->39|756->84|831->133|845->139|900->174|1004->251|1032->252|1063->257|1121->288|1149->289|1190->304|1250->337|1278->338|1317->350|1345->351|1414->393|1442->394|1478->403|1558->456|1586->457|1618->462|1654->471|1682->472|1718->481|1773->509|1801->510|1833->515|2024->679|2039->685|2103->728|2178->776|2193->782|2250->818|2310->851|2325->857|2383->894
                  LINES: 19->1|22->1|23->2|23->2|23->2|23->2|24->3|24->3|24->3|27->6|27->6|28->7|28->7|28->7|30->9|31->10|31->10|33->12|33->12|37->16|37->16|38->17|40->19|40->19|41->20|42->21|42->21|43->22|44->23|44->23|45->24|47->26|47->26|47->26|48->27|48->27|48->27|49->28|49->28|49->28
                  -- GENERATED --
              */
          