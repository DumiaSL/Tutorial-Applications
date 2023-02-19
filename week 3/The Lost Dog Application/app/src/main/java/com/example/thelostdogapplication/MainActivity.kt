package com.example.thelostdogapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dogs = mutableListOf(0,1,2,3,4,5)
        val attend=0
        val correct=0

        val all_correct_rounds=0
        val all_Incorrect_rounds=0
        val main_button : Button = findViewById(R.id.continue_button)

        main_button.setOnClickListener {
            val rannum=(0 until dogs.size).random()

            when (dogs[rannum]) {
                0 ->{
                    dogs.removeAt(rannum)
                    val intent = Intent(this, Dog_1::class.java)
                    intent.putExtra("dog list", ArrayList(dogs))
                    intent.putExtra("attend", attend)
                    intent.putExtra("correct", correct)
                    intent.putExtra("All_correct", all_correct_rounds)
                    intent.putExtra("All_incorrect", all_Incorrect_rounds)
                    startActivity(intent)
                }
                1 -> {
                    dogs.removeAt(rannum)
                    val intent = Intent(this, Dog_2::class.java)
                    intent.putExtra("dog list", ArrayList(dogs))
                    intent.putExtra("attend", attend)
                    intent.putExtra("correct", correct)
                    intent.putExtra("All_correct", all_correct_rounds)
                    intent.putExtra("All_incorrect", all_Incorrect_rounds)
                    startActivity(intent)
                }
                2 -> {
                    dogs.removeAt(rannum)
                    val intent = Intent(this, Dog_3::class.java)
                    intent.putExtra("dog list", ArrayList(dogs))
                    intent.putExtra("attend", attend)
                    intent.putExtra("correct", correct)
                    intent.putExtra("All_correct", all_correct_rounds)
                    intent.putExtra("All_incorrect", all_Incorrect_rounds)
                    startActivity(intent)
                }
                3 -> {
                    dogs.removeAt(rannum)
                    val intent = Intent(this, Dog_4::class.java)
                    intent.putExtra("dog list", ArrayList(dogs))
                    intent.putExtra("attend", attend)
                    intent.putExtra("correct", correct)
                    intent.putExtra("All_correct", all_correct_rounds)
                    intent.putExtra("All_incorrect", all_Incorrect_rounds)
                    startActivity(intent)
                }
                4 ->{
                    dogs.removeAt(rannum)
                    val intent = Intent(this, Dog_5::class.java)
                    intent.putExtra("dog list", ArrayList(dogs))
                    intent.putExtra("attend", attend)
                    intent.putExtra("correct", correct)
                    intent.putExtra("All_correct", all_correct_rounds)
                    intent.putExtra("All_incorrect", all_Incorrect_rounds)
                    startActivity(intent)
                }
                5 ->{
                    dogs.removeAt(rannum)
                    val intent = Intent(this, Dog_6::class.java)
                    intent.putExtra("dog list", ArrayList(dogs))
                    intent.putExtra("attend", attend)
                    intent.putExtra("correct", correct)
                    intent.putExtra("All_correct", all_correct_rounds)
                    intent.putExtra("All_incorrect", all_Incorrect_rounds)
                    startActivity(intent)
                }
            }
        }
    }
}