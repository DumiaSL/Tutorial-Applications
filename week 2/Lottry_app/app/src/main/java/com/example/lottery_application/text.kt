package com.example.lottery_application

import java.util.*

fun main(){
    var ran_num: Int
    var count = 0
    var check: Boolean


    val numers = IntArray(6)

    val ran = Random()
    print("Lottry numbers are - ")
    while (count < numers.size) {
        check = true
        ran_num = (0..49).random()
        if (count != 0) {
            for (x in 0 until count) {
                if (numers[x] == ran_num) {
                    check = false
                    break
                }
            }
            if (check) {
                numers[count] = ran_num
                count++
            }
        } else {
            numers[count] = ran_num
            count++
        }
    }

    for (s in numers) {
        print("$s ")
    }
}