package com.pasaoglu.insiderlibrary.data.models

import com.pasaoglu.insiderlibrary.data.enums.BrightnessEnum
import com.pasaoglu.insiderlibrary.data.enums.ColorEnum
import com.pasaoglu.insiderlibrary.data.enums.SizeEnum

data class StarModel(var color: ColorEnum, val brightness: BrightnessEnum, val size: SizeEnum)