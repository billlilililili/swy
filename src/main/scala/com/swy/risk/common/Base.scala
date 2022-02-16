package com.swy.risk.common

import java.text.SimpleDateFormat
import java.util.{Calendar, Date}
import org.apache.spark.internal.Logging


/**
  * User   : lxm
  * Date   : 2019-04-05
  * Purpose: 基础类
  * Change :
  */
trait Base extends Logging with Serializable{

  var currentTime = Calendar.getInstance().getTimeInMillis

  val smClsID = this.getClass.getSimpleName.stripSuffix("$")

  def getCurrentTimeInMillis: Long ={
    Calendar.getInstance().getTimeInMillis
  }

  def getCurrentTime(): String = {
    val df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val dt = df.format(new Date())
    dt
  }

  def logInfo(msg: => LogMsg, typ:Int = 0): Unit =  {
    if(true) {
      println(smClsID + " = " + msg.toString)
    }else{
      logInfo(smClsID + " = " + msg.toString)
    }
  }



}
