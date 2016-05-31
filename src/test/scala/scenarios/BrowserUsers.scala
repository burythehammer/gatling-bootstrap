package scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import requests.{LoadSearchPage, SearchResult}


object BrowserUsers {

  val searchFromBrowser: ScenarioBuilder = scenario("User searches from their browser")
    .exec(LoadSearchPage.searchForRandomValues)
    .exec(SearchResult.clickRandomSearchResult)

}
