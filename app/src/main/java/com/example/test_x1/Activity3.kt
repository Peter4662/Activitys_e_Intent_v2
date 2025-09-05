package com.example.test_x1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val nameR = intent.getStringExtra("name")
        val tName : TextView = findViewById(R.id.textView)
        val ciudad = intent.getStringExtra("ciudad")

        tName.text = "Bienvenido $nameR, tu ciudad es $ciudad"
    }
}