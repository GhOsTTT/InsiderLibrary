package com.pasaoglu.insiderlibrary

import com.pasaoglu.insiderlibrary.data.enums.BrightnessEnum
import com.pasaoglu.insiderlibrary.data.enums.ColorEnum
import com.pasaoglu.insiderlibrary.data.enums.SizeEnum
import com.pasaoglu.insiderlibrary.data.models.StarModel

class GenerateStar {
    private val starsList = mutableListOf<StarModel>()
    private val starListSize = 10

    // Single-interface
    fun createStar(size: SizeEnum) {
        if (starsList.size == starListSize - 1) {
            println("Sky is full")
            throw Exception("Sky is full")//it could be toast message.
        }
        val star = if (size == SizeEnum.BIG) {
            createBigStar()
        } else {
            createSmallStar()
        }
        starsList.add(star)
        printAllList()
    }
/*
    private fun createStar(size: SizeEnum): StarObject {
          if(startList.size == starListSize-1) {
            println("Sky is full")
            throw Exception("Sky is full")//it could be toast message.
        }
        val star = StarModel(
            ColorEnum.values().random(),
            BrightnessEnum.values().random(),
            size
        )
        startList.add(star)
        printAllList()
    }
 */

    private fun createBigStar(): StarModel {
        return StarModel(
            ColorEnum.values().random(),
            BrightnessEnum.values().random(),
            SizeEnum.BIG
        )
    }

    private fun createSmallStar(): StarModel {
        return StarModel(
            ColorEnum.values().random(),
            BrightnessEnum.values().random(),
            SizeEnum.SMALL
        )
    }

    private fun printAllList() {
        println("Print All List = ")
        println(starsList.joinToString("\n"))
        println("Sum of bright stars = ${starsList.filter { it.brightness == BrightnessEnum.BRIGHT }.size}")
    }
}