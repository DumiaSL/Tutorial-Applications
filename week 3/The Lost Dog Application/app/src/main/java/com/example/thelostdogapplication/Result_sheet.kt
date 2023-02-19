package com.example.thelostdogapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result_sheet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_sheet)

        val results : TextView = findViewById(R.id.RusultText)
        val playAgain : Button = findViewById(R.id.playagain)
        val allcorrectext : TextView = findViewById(R.id.allcorrect)
        val allincorrecttext : TextView = findViewById(R.id.allincorrect)

        var attend=intent.getIntExtra("attend",0)
        var correct=intent.getIntExtra("correct",0)
        var all_correct_rounds=intent.getIntExtra("All_correct",0)
        var all_Incorrect_rounds=intent.getIntExtra("All_incorrect",0)

        println(correct)

        results.text = "$correct/$attend"
        all_correct_rounds += correct
        all_Incorrect_rounds += (attend - correct)

        allcorrectext.text= all_correct_rounds.toString()+"/"+(all_correct_rounds+all_Incorrect_rounds).toString()
        allincorrecttext.text= all_Incorrect_rounds.toString()+"/"+(all_correct_rounds+all_Incorrect_rounds).toString()

        playAgain.setOnClickListener{
            val dogs = mutableListOf(0,1,2,3,4,5)
            attend=0
            correct=0

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