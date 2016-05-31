package simulations

import io.gatling.core.Predef._
import scenarios.{BrowserUsers, HomepageUsers}

class MoreInteresting extends Simulation {

  setUp(

    HomepageUsers.searchFromHomepage.inject(heavisideUsers(50) over 10),

    BrowserUsers.searchFromBrowser.inject(
      nothingFor(5),
      rampUsers(20) over 5

    ))
    .throttle(jumpToRps(3),
      holdFor(20))
    .maxDuration(1000)
    .protocols(Protocols.duckDuckGo)
    .assertions(global.successfulRequests.percent.greaterThan(95))

}
