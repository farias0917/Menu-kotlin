package com.farias0917.biblioteca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val botoncalculadora = findViewById<Button>(R.id.botonCaluladora)
        val botonBanco = findViewById<Button>(R.id.botonBanco)

        botoncalculadora.setOnClickListener {
            val intento = Intent(this, Calculadora::class.java)
            startActivity(intento)
        }

        botonBanco.setOnClickListener {
            val intento = Intent(this, Banco::class.java)
            startActivity(intento)
        }
    }
}