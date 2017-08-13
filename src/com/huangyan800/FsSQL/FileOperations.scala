package com.huangyan800.FsSQL

import java.io._
import scala.io.Source

class FileOperations {

  def CreateFile(filename: String , fileurl:String, tblprpts: String): Unit = {
    var fileName = filename + ".txt"
    var fileUrl = fileurl + fileName
    val file = new FileWriter(fileUrl)
    file.write(tblprpts + "\n") //write table head with \n
    file.close()
  }

  def AddRow(filename: String, fileurl: String): Unit ={
    var fileName = filename + ".txt"
    var fileUrl = fileurl + fileName
    val file = new FileWriter( fileUrl ,true)
    file.write("\n")
    file.write("asdadsa")
    file.close()
    println("add successful")
  }

  def AddRowWithValue(filename: String, fileurl: String, value:String): Unit ={
    val file = new FileWriter( fileurl + filename + ".txt" ,true)
    file.write(value+"\n")
    file.close()
    println("[Notice] add successful")
  }

  def ModifyRow(filename: String, fileurl: String, filters: Array[String] ): Unit ={
    var fileName = filename + ".txt"
    var fileUrl = fileurl + fileName
    val file = new FileWriter( fileUrl ,true)
    var i = 0
    for(i<- 0 to filters.length-1){
      println(filters(i))
    }

    var A:Map[String, Int] = Map()
    val colors = Map("name1" -> 1, "age" -> 2, "grade" -> 3)

    //提取表头






  }

  def PrintFileWithLimit(filename:String, fileurl:String, begin:Int, end:Int): Unit ={
    println("[pwd]:" + fileurl + filename + ".txt" )

    var row_num = 0
    val file = Source.fromFile(fileurl + filename + ".txt")
    for( line <- file.getLines ){
      if( 0 == row_num ){
        println("|===============================|")
        println("|"+line)
        println("|-------------------------------|")
      }
      else if( row_num >= begin && row_num <= end ){
        println("|"+line)
      }

      row_num = row_num + 1
    }

    println("|_______________________________|")
  }

}
