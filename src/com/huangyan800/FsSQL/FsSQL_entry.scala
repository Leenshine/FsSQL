package com.huangyan800.FsSQL

object FsSQL_entry {
  def main(args : Array[String]): Unit = {
    println("Welcom, This is FileSystem based SQL Database!")
    val fsTabl = new FsTabl("stu", "/home", "name,no,age")
    val test = new FileOperations
//    test.CreateFile("E:\\test22")
//    test.AddRow("test22", "E:\\")

    //test.ModifyRow("test22", "E:\\",Array("name=leen", "age=25", "grade=100"))

    test.CreateFile("test22","E:\\","name,no,age")
    test.PrintFileWithLimit("test22","E:\\",0, 5)
    test.AddRowWithValue("test22","E:\\","leen,001,18")
    test.AddRowWithValue("test22","E:\\","shaohv,002,19")
    test.PrintFileWithLimit("test22","E:\\",1, 5)
  }
}
