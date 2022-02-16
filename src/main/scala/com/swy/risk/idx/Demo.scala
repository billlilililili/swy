package com.swy.risk.idx

import com.swy.risk.common.Base
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession


class Demo extends Base{

  def ids1(sc:SparkContext,hiveContext:SparkSession): Unit = {

    hiveContext.sql("use test")

    val res = hiveContext.sql(
      s"""
         |select * from t1
       """.stripMargin)

    res.show()

    sc.stop()

  }

}
