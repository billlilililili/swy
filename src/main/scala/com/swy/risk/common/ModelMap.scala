package com.swy.risk.common

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}


/**
  * User   :
  * Date   :
  * Purpose:
  * Change :
  */
object ModelMap {
  private val conf = new SparkConf().set("spark.default.parallelism", "160")              // 设置Task并行度
                                    .set("spark.sql.shuffle.partitions","240")            // 设置readshuffle并行度
                                    .set("spark.locality.wait", "8")                      // 设置数据本地化等待时间
                                    .set("spark.yarn.executor.memoryOverhead", "4096")    // 设置堆外内存

  val sc = new SparkContext(conf)

  var hiveContext: SparkSession = SparkSession.builder()
                                .appName("test")
                                .enableHiveSupport()
                                .getOrCreate()

}
