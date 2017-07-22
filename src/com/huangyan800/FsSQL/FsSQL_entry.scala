package com.huangyan800.FsSQL

object FsSQL_entry {
  def main(args : Array[String]): Unit = {
    println("Welcom, This is FileSystem based SQL Database!")
<<<<<<< HEAD:src/FsSQL_entry.scala
=======
    val fsTabl = new FsTabl("stu", "/home", "name, no, age")
    println(fsTabl)
    fsTabl.create_table()
    println("exit db")
>>>>>>> 22838a7... modol is over:src/com/huangyan800/FsSQL/FsSQL_entry.scala
  }
}
