/*
数据表类
 */

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

  def delete_table(name:String):Int = {
    println("Delete table begin")

    println("---------end----------")
    0
  }

  def select_table(name:String):Int = {
    0
  }
}


//此处定义一个数据表管理表mgrtable，用来存放数据表的表名，路径等。当我们新建一个数据表时，希望将新建表的表名，路径等存入改表，删除表时也同时删除此表内与所删除表相对应的信息。
object FsTabl{
  //我们利用伴生对象来创建该数据表管理表，希望在FsSQL程序启动时便可以自动生成该表。
  val mgrtable = new FsTabl("mgrtable", "/home", "tablename url")
  def fangfa(){
    //后期将实现在FsSQL程序启动时便可以自动生成该表的方法
  }
}
