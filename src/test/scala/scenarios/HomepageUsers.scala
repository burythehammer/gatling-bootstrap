package scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import requests.{LoadHomePage, LoadSearchPage, SearchResult}


object HomepageUsers {

  val searchFromHomepage: ScenarioBuilder = scenario("User searches from homepage")
    .exec(LoadHomePage.loadHomePage)
    .exec(LoadSearchPage.searchForRandomValues)
    .exec(SearchResult.clickRandomSearchResult)

}




