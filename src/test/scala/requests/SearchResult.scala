package requests

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

import scala.util.Random


object SearchResult {


  val clickFirstSearchResult: ChainBuilder = exec(http("Click first search result")
    .get("${links(1)}")
    .headers(Headers.headers_1)
    .check(
      status.is(200)
    )
  )

  val clickRandomSearchResult: ChainBuilder = exec(http("Click random search result")
    .get("${links.random()}")
    .headers(Headers.headers_1)
    .check(
      status.is(200)
    )
  )


}

