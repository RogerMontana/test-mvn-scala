package scala.demo.app

/**
  * Created by artem on 3/30/17.
  */
object Commands {

  sealed abstract class Command
  case object FIND extends Command
  case object STOP extends Command
  case object SHOW_RESULTS extends Command
  case object START extends Command

}
