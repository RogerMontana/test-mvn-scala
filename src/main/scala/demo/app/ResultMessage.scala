package scala.demo.app

/**
  * Created by artem on 4/3/17.
  */
trait ResultMessage[T] {
  def flatMap[U](f: T => ResultMessage[U]): ResultMessage[U]
  def unit[T] (x: T): ResultMessage[T]

}
