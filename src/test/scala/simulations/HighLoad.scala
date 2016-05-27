package simulations

import io.gatling.core.Predef._
import scenarios.{BrowserUsers, HomepageUsers}

class HighLoad extends Simulation {

  setUp(
    HomepageUsers.searchFromHomepage.inject(atOnceUsers(10)),
    BrowserUsers.searchFromBrowser.inject(
      nothingFor(5),
      rampUsers(20) over 5
    )

  ).protocols(Protocols.duckDuckGo)
  .assertions(global.successfulRequests.percent.is(100))

}
