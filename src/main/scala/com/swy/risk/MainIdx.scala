package com.swy.risk

import com.swy.risk.idx.Demo
import com.swy.risk.common.ModelMap

object MainIdx {

  def main(args: Array[String]): Unit = {

    val batch = Map(
      "test" -> new Demo().ids1 _
    )

    batch(args(0))(ModelMap.sc,ModelMap.hiveContext)

  }

}
