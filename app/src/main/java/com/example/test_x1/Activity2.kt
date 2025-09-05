package com.example.test_x1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val btnSiguiente : Button = findViewById(R.id.btn_resumen)
        val txtCiudad : EditText = findViewById(R.id.txt_ciudad)



        btnSiguiente.setOnClickListener {
            val ciudad = txtCiudad.text.toString()
            val nombre = intent.getStringExtra("name")
            val intent = Intent(this,Activity3::class.java).apply {
                putExtra("ciudad", ciudad)
                putExtra("name", nombre)
            }
            startActivity(intent)
            //funcionando
        }
    }
}