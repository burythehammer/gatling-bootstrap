package simulations

import io.gatling.core.Predef._
import scenarios.BrowserUsers

class Spike extends Simulation {

  setUp(
    BrowserUsers.searchFromBrowser.inject(atOnceUsers(100))
  ).protocols(Protocols.duckDuckGo)

}
