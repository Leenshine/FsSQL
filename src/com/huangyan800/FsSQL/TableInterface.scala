/*
数据表操作接口
 */

package com.huangyan800.FsSQL

trait TableInterface {
  def create_table(name:String, prpts:String, URL:String):Int

  def delete_table(name:String):Int

  def select_table(name:String):Int
}
