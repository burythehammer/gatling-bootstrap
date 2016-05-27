package scenarios

import io.gatling.core.Predef._
import requests.{SearchResult, LoadSearchPage}


object BrowserUsers {
  val searchFromBrowser = scenario("User searches from their browser")
    .exec(LoadSearchPage.search)
    .exec(SearchResult.clickRandomSearchResult)
}
