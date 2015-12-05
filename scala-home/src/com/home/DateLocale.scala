package com.home

//import java classes
//we can import multiple classes using curly braces
import java.util.{ Date, Locale }
import java.text.DateFormat
// wildcard import
import java.text.DateFormat._

object DateLocale {
  
  def main(args: Array[String]) {
    
    // use java class to get a date instance
    val now = new Date
    val df = getDateInstance(LONG, Locale.CHINESE)
    
    // same as writing println( df.format(now) )
    println(df format now)
    
  }
}