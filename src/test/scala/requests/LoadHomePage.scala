package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder


object LoadHomePage {

  val loadHomePage: ChainBuilder = exec(http("Load Home Page")
    .get("/")
    .headers(Headers.headers_1)
    .check(status.is(200))
  )


}
