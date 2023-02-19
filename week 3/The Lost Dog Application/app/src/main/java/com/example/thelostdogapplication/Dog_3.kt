package com.example.thelostdogapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Dog_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog3)


        val checkButton : Button = findViewById(R.id.check1Button)
        val dogName : EditText = findViewById(R.id.dogname1)
        val submitP : TextView = findViewById(R.id.result)
        val correct_image : ImageView = findViewById(R.id.correct)
        val wrong : ImageView = findViewById(R.id.wrong)
        val finishBtn : Button = findViewById(R.id.finish)

        var dogs= intent.getIntegerArrayListExtra("dog list")
        var attend=intent.getIntExtra("attend",0)
        var correct=intent.getIntExtra("correct",0)

        val all_correct_rounds=intent.getIntExtra("All_correct",0)
        val all_Incorrect_rounds=intent.getIntExtra("All_incorrect",0)

        attend++;

        finishBtn.setOnClickListener{
            val intent = Intent(this, Result_sheet::class.java)
            intent.putExtra("attend", attend)
            intent.putExtra("correct", correct)
            intent.putExtra("All_correct", all_correct_rounds)
            intent.putExtra("All_incorrect", all_Incorrect_rounds)
            startActivity(intent)
        }


        checkButton.setOnClickListener {
            if (!(dogName.text.isEmpty())){
                if (checkButton.text=="Check"){
                    checkButton.text="Next One"
                    if (dogName.text.toString().lowercase()=="irish setter"){
                        submitP.setVisibility(View.VISIBLE)
                        correct_image.setVisibility(View.VISIBLE)
                        correct++

                    }else{
                        submitP.setTextColor(Color.parseColor("#FF0000"))
                        submitP.text="Wrong"
                        dogName.setText("Irish Setter")
                        submitP.setVisibility(View.VISIBLE)
                        wrong.setVisibility(View.VISIBLE)
                    }
                }else {
                    println(attend)
                    if (attend == 3) {
                        val intent = Intent(this, Result_sheet::class.java)
                        intent.putExtra("attend", attend)
                        intent.putExtra("correct", correct)
                        intent.putExtra("All_correct", all_correct_rounds)
                        intent.putExtra("All_incorrect", all_Incorrect_rounds)
                        startActivity(intent)
                    } else {
                        val rannum = (0 until (dogs?.size!!)).random()

                        when (dogs[rannum]) {
                            0 -> {
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
                            4 -> {
                                dogs.removeAt(rannum)
                                
                                val intent = Intent(this, Dog_5::class.java)
                                intent.putExtra("dog list", ArrayList(dogs))
                                intent.putExtra("attend", attend)
                                intent.putExtra("correct", correct)
                                intent.putExtra("All_correct", all_correct_rounds)
                                intent.putExtra("All_incorrect", all_Incorrect_rounds)
                                startActivity(intent)
                            }
                            5 -> {
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
            }else{
                Toast.makeText(applicationContext,"Must Fill", Toast.LENGTH_SHORT).show()
            }
        }
    }
}