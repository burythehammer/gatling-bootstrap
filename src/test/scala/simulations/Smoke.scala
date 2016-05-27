package simulations

import io.gatling.core.Predef._
import scenarios.{BrowserUsers, HomepageUsers}

class Smoke extends Simulation {

  setUp(
    HomepageUsers.searchFromHomepage.inject(atOnceUsers(1)),
    BrowserUsers.searchFromBrowser.inject(atOnceUsers(1))
  ).protocols(Protocols.duckDuckGo)

}
