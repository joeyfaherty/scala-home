package com.home.syntax.basics

/**
 * HelloWorld scala program with explanation.
 */

/* the object declaration declares a singleton class, 
 * with an instance method, main.  
 * Think of object as a class with only static members.
 */
object HelloWorld {
  
  /* the main method is not declared as static here. 
   * This is because static members (methods or fields) do not exist in Scala. 
   * Rather than defining static members, 
   * the Scala programmer declares these members in singleton objects
   */
  def main(args: Array[String]) {
    /*
     * The main method does not return a value (it is a procedure method). 
     * Therefore, it is not necessary to declare a return type
     */
    println("Hello, world!")
  }
}