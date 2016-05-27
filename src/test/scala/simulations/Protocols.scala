package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object Protocols {

  val duckDuckGo = http
    .baseURL("https://www.duckduckgo.com")
    .inferHtmlResources()

}









