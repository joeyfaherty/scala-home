package com.home.syntax.scalavsjava


object HelloWorldScala {
  // args is a method parameter of type Array[String].  That is to say, args is a string array
  def main(args:Array[String]) = {
    // taking advantage of Scala’s type inference mechanism
    var greeting = ""
    // Here we see that foreach is a method of class Array that takes a closure (anonymous function) 
    // as a parameter.  The foreach method then calls that closure once for each element, passing 
    // the element as a parameter to the closure (arg).  
    // The arg parameter has an inferred type of String because we're iterating over an array of strings.
    args.foreach(arg => greeting += (arg + " "))
    if (args.length > 0) greeting = greeting.substring(0, greeting.length - 1)
 
    println(greeting)
  }
}
/**
 *  here's how we would use the above API in Java 
 */
/*
public class HelloWorld2 {
    public static void main(Array<String> args) {
        final StringBuilder greeting = new StringBuilder();
        args.foreach(new Callback<String>() {
            public void operate(String element) {
                greeting.append(element).append(' ');
            }
        });
        if (args.length() > 0) {
            greeting.setLength(greeting.length() - 1);
        }
 
        System.out.println(greeting.toString());
    }
}
*/