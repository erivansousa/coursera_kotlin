package week2

import java.awt.Color

fun main(){
   println(convert(15))
   println(convert(5))
   println(convert(50))
}

fun convert(temp: Int) = when {
        temp < 10 -> "cold" to Color.BLUE
        temp < 30 -> "normal" to Color.ORANGE
        else -> "hot" to Color.RED
    }