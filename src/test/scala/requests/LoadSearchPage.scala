package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._


object LoadSearchPage {

  val searchForRandomValues : ChainBuilder = randomSwitch(
    40.0 -> search("opencredo"),
    30.0 -> search("gatling"),
    10.0 -> search("apples"),
    7.0 -> search("physics"),
    3.0 -> search("ducks")
  )

  def search(searchTerm: String) : ChainBuilder = {
    exec(http("Loading Search Page")
      .get("/?q=" + searchTerm)
      .headers(Headers.headers_1)
      .check(
        status.is(200),
        css("""a.'result__a'""", "href").findAll.saveAs("links")
      )
    )
  }


}