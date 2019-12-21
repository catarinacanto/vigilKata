// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macbookpro/Documents/Kata/vigilKata/conf/routes
// @DATE:Sat Dec 21 20:48:34 WET 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
