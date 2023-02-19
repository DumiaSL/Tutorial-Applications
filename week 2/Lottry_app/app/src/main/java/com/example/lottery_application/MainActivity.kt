package com.example.lottery_application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val main_button : Button = findViewById(R.id.button7)

        main_button.setOnClickListener {
            val intent = Intent(this, Genarate_numbers::class.java)
            startActivity(intent)

        }

    }
}