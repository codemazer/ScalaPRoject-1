package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready. Yippy!"))
  }
  
  def hello = Action {
    Ok(views.html.hello("hello world  application is ready."))
  }
}
