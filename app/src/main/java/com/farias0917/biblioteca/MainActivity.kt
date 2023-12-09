package com.farias0917.biblioteca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usuario = findViewById<EditText>(R.id.editTextUsuario)
        val contrasena = findViewById<EditText>(R.id.editTextContrasena)
        val botonIniciar = findViewById<Button>(R.id.buttonIngresar)
        val mensaje = findViewById<TextView>(R.id.textViewMensaje)

        mensaje.setText("")

        botonIniciar.setOnClickListener{
            if (usuario.text.toString().equals("Admin") && contrasena.text.toString().equals("091705")){
                val intento = Intent(this, Menu::class.java)
                startActivity(intento)
                mensaje.setText("")
            }else{
                mensaje.setText("Datos incorrectos")
            }
        }

    }
}