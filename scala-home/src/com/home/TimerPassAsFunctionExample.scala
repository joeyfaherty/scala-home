package com.home

/**
 * Main method passes the timeFlies Function to the 
 * oncePerSecond function as a parametre.
 */
object TimerPassAsFunctionExample {
  // The type of this function is written () => Unit 
  //and is the type of all functions which 
  //take no arguments and return nothing
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 55 }
  }
  def timeFlies() {
    println("time flies like an arrow...")
  }
  def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}