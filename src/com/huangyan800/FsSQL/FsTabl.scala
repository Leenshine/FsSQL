package com.huangyan800.FsSQL

import scala.collection.mutable.ArrayBuffer

class FsTabl(val tblname:String, val tableurl:String)
  extends Table(0, tableurl) with TableInterface {

  var prpts = new ArrayBuffer[String]
  var tablename = tblname

  private def trans_prpts(prpts:String) = {
    println("Start tranfer table prpts")
  }

  def this(tblname:String, tblurl:String, tblprpts:String) = {
    this(tblname, tblurl)
    trans_prpts(tblprpts)
  }

  override def toString: String = {
    println("tbl_name:" + tblname + " " + "path[" + Url + "]")
    ""
  }

  def create_table(name:String, prpts:String, URL:String):Int = {
    println("create table begin")

    println("---------end----------")
    0
  }

  def delete_table(name:String):Int ={
    println("Delete table begin")

    println("---------end----------")
    0
  }
}
