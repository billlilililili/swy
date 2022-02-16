package com.swy.risk.common

import java.text.SimpleDateFormat
import java.util.Date

import com.swy.risk.common.LogGrade.LogGrade



/**
  * User   :
  * Date   : 2019-04-05
  * Purpose: 日志信息类
  * Change :
  */
object LogGrade extends Enumeration{
  type LogGrade = Value
  val INFO,WARN,ERRO = Value
}

case class LogMsg
(
   logId : Long = new Date().getTime,
   logGrade :  LogGrade = LogGrade.INFO,  //日记分类   只分3类：一般，异常，警告
   logDate : String = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), //日志时间
   logMsg: String = "", //日记信息
   msgIndents : Int = 0, //日记信息等级
   execSec : Long = 0, //执行耗时（秒）
   execSQL : String = "", //执行代码
   targetTbl : String = "" //程序处理目标表
)

