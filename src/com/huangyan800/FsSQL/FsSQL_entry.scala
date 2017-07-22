package com.huangyan800.FsSQL

object FsSQL_entry {
  def main(args : Array[String]): Unit = {
    println("Welcom, This is FileSystem based SQL Database!")
    val fsTabl = new FsTabl("stu", "/home", "name, no, age")
    println(fsTabl)
    println("exit db")
  }
}
