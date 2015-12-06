package com.home.syntax.basics

/**
 * Same as TimerPassAsFunctionExample but we remove the timeFlies function, 
 * and replace it using an anonymous function.
 */
object TimerPassAsFunctionAnonymous {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  // the right arrow => separates
  // the function’s argument list from its body
  def main(args: Array[String]) {
    oncePerSecond(() =>
      println("time flies like an arrow..."))
  }
}