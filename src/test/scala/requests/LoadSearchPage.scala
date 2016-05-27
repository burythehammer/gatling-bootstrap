package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object LoadSearchPage {

//  val searchForRandomValues = randomSwitch(
//    40.0 -> search("opencredo"),
//    30.0 -> search("gatling"),
//    10.0 -> search("apples"),
//    7.0 -> search("physics"),
//    3.0 -> search("ducks")
//  )

  val search = exec(http("Loading Search Page")
      .get("/?q=" + "opencredo")
      .headers(Headers.headers_1)
      .check(
        status.is(200),
        css("""a.'result__a'""", "href").findAll.saveAs("links")
      )
    )


}