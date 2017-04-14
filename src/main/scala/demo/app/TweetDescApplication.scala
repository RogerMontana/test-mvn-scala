package scala.demo.app

import akka.actor.{ActorSystem, Props}
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.boot.web.support.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

import scala.concurrent.{Future, Promise}
import scala.demo.app.Commands.{START, STOP}
import scala.util.Try

/**
  * @author ${user.name}
  */

@EnableAutoConfiguration
@ComponentScan
class SampleConfig


@RequestMapping(Array("/api"))
@RestController
class Controller extends SpringBootServletInitializer {

  val system = ActorSystem("mySystem")
  val myActor = system.actorOf(Props[MyActor], "myactor2")

  @RequestMapping(Array("/start"))
  def start() = myActor ! START

  @RequestMapping(Array("/hello"))
  def hello: String = "hello"

  @RequestMapping(Array("/error"))
  def error: String = "Error handling"

  @RequestMapping(Array("/stop"))
  def mainPageStop() = {
    myActor ! STOP
    system.stop(myActor)
    system.mailboxes.deadLetterMailbox.becomeClosed()
    system.terminate()

  }
}

object TweetDescApplication {

  val system = ActorSystem("mySystem")
  val myActor = system.actorOf(Props[MyActor], "myactor2")


  def main(args: Array[String]) {
    SpringApplication.run(classOf[SampleConfig])
    myActor ! START
  }
}
