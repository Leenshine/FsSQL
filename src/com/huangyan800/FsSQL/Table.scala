package com.huangyan800.FsSQL

abstract class Table(lock:Int, tableurl:String) {
  private var tablelock = lock //0 is open
  private var url = tableurl

  def Lock = tablelock
  def Lock_=( tlock : Int) = tlock

  def Url = url


/*
  def this(lock:Int, tableurl:String){
    this()
    this.tablelock = lock
    this.url = tableurl
    println("tableU storage in" + url)
  }
*/
}

object Table{
  val MAX_PROPERTY_SIZE = 1024
}
