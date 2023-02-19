package com.example.week1application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_click_me : Button = findViewById(R.id.button)
        val textView : TextView = findViewById(R.id.textView2)
        var times_me_click=0
        textView.text=times_me_click.toString()


        btn_click_me.setOnClickListener {
            times_me_click++
            textView.text=times_me_click.toString()
            Toast.makeText(this@MainActivity,
            "Click Me",
            Toast.LENGTH_LONG).show()
        }
    }
}