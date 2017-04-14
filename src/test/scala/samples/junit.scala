package samples

import javap.demo.app.TweetDeskApp

import org.junit._
import Assert._

@Test
class AppTest {

  @Test
  def testGreetingFormJava() = {
    val a = TweetDeskApp.greetingJava()
    assertEquals(a, "hi from java")
  }

  //    @Test
  //    def testKO() = assertTrue(false)

}


