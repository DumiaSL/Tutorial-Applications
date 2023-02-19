package com.example.lottery_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.util.*

class Genarate_numbers : AppCompatActivity() {
    val numbers = IntArray(6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genarate_numbers)


        val buttonSubmit : Button = findViewById(R.id.button)
        val button_1 : Button = findViewById(R.id.button2)
        val button_2 : Button = findViewById(R.id.button3)
        val button_3 : Button = findViewById(R.id.button4)
        val button_4 : Button = findViewById(R.id.button5)
        val button_5 : Button = findViewById(R.id.button6)
        val button_6 : Button = findViewById(R.id.button8)
        val textField : EditText = findViewById(R.id.editTextNumber)

        getLotterynumbers(textField)
        button_1.text= numbers[0].toString()
        button_2.text= numbers[1].toString()
        button_3.text= numbers[2].toString()
        button_4.text= numbers[3].toString()
        button_5.text= numbers[4].toString()
        button_6.text= numbers[5].toString()

        buttonSubmit.setOnClickListener {
            getLotterynumbers(textField)
            button_1.text= numbers[0].toString()
            button_2.text= numbers[1].toString()
            button_3.text= numbers[2].toString()
            button_4.text= numbers[3].toString()
            button_5.text= numbers[4].toString()
            button_6.text= numbers[5].toString()

        }

        button_1.setOnClickListener{
            button_1.text=newGenarateNumber(textField).toString()
        }
        button_2.setOnClickListener{
            button_2.text=newGenarateNumber(textField).toString()
        }
        button_3.setOnClickListener{
            button_3.text=newGenarateNumber(textField).toString()
        }
        button_4.setOnClickListener{
            button_4.text=newGenarateNumber(textField).toString()
        }
        button_5.setOnClickListener{
            button_5.text=newGenarateNumber(textField).toString()
        }
        button_6.setOnClickListener{
            button_6.text=newGenarateNumber(textField).toString()
        }

    }

    private fun newGenarateNumber(textField: EditText): Int {
        var ran_num: Int
        var check: Boolean


        val ran = Random()
        while (true) {
            check = true
            ran_num = (1..49).random()
            if (!(textField.text.toString().toInt() == ran_num)){
                for (x in 0 until numbers.size) {
                    if ((numbers[x] == ran_num) ) {
                        check = false
                        break
                    }
                }
                if (check) {
                    return ran_num
                }
            }
        }
    }

    public fun getLotterynumbers(textField: EditText) {
        var ran_num: Int
        var count = 0
        var check: Boolean


        val ran = Random()
        print("Lottry numbers are - ")
        while (count < numbers.size) {
            check = true
            ran_num = (1..49).random()
            try {
                if (textField.text.toString().toInt() != ran_num){
                    if (count != 0) {
                        for (x in 0 until count) {
                            if ((numbers[x] == ran_num) ) {
                                check = false
                                break
                            }
                        }
                        if (check) {
                            numbers[count] = ran_num
                            count++
                        }
                    } else {
                        numbers[count] = ran_num
                        count++
                    }
                }
            }catch (_: java.lang.Exception){
                if (count != 0) {
                    for (x in 0 until count) {
                        if ((numbers[x] == ran_num) ) {
                            check = false
                            break
                        }
                    }
                    if (check) {
                        numbers[count] = ran_num
                        count++
                    }
                } else {
                    numbers[count] = ran_num
                    count++
                }
            }
        }
    }
}