package scenarios

import io.gatling.core.Predef._
import requests.{SearchResult, LoadHomePage, LoadSearchPage}


object HomepageUsers {

  val searchFromHomepage = scenario("User searches from homepage")
    .exec(LoadHomePage.loadHomePage)
    .exec(LoadSearchPage.search)
    .exec(SearchResult.clickRandomSearchResult)

}
