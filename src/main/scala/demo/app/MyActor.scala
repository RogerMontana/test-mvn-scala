package scala.demo.app

import akka.actor.{Actor, ActorLogging}

import scala.demo.app.Commands.{SHOW_RESULTS, START, STOP}


/**
 * @author ${user.name}
 */
class MyActor extends Actor with ActorLogging {

  override def receive: Receive = {
    case START => log.info("start message")
    case STOP => log.info("stop message")
    case SHOW_RESULTS =>
    case _ => log.info("another message")
  }

}
