package com.farias0917.biblioteca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Banco : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banco)

        val btnMostrar = findViewById<Button>(R.id.botonMostrar)
        val btnRecargar = findViewById<Button>(R.id.botonRecargar)
        val btnRetirar = findViewById<Button>(R.id.botonRetirar)
        val btnVolver = findViewById<Button>(R.id.botonVolver)
        val saldoRr = findViewById<EditText>(R.id.editTextSaldoRg)
        val mensajeSaldo = findViewById<TextView>(R.id.textViewMensajeSaldo)
        var saldo = 0

        mensajeSaldo.setText("")

        btnMostrar.setOnClickListener {
            mensajeSaldo.setText("Saldo actual: ${saldo}$")
        }

        btnRecargar.setOnClickListener{
            mensajeSaldo.setText("")
            val saldoRstr = saldoRr.text.toString()

            if (saldoRstr.equals("")){
                Toast.makeText(this, "Debe ingresar el valor a recargar", Toast.LENGTH_LONG).show()
            }else{
                val saldoR = saldoRstr.toInt()
                saldo = saldo + saldoR
                Toast.makeText(this, "¡Su recarga se ha realizado con exito!", Toast.LENGTH_LONG).show()

            }
        }

        btnRetirar.setOnClickListener{
            mensajeSaldo.setText("")
            val saldoRetirarStr = saldoRr.text.toString()
            if (saldoRetirarStr.equals("")){
                Toast.makeText(this, "Debe ingresar el valor a retirar", Toast.LENGTH_LONG).show()
            }else{
                val saldoRetirar = saldoRetirarStr.toInt()
                if (saldoRetirar > saldo){
                    Toast.makeText(this, "No tiene suficiente dinero para retirar", Toast.LENGTH_LONG).show()

                }else{
                    saldo = saldo - saldoRetirar
                    Toast.makeText(this, "¡Su dinero ha sido retirardo con exito!", Toast.LENGTH_LONG).show()

                }
            }
        }

        btnVolver.setOnClickListener {
            val intento = Intent(this, Menu::class.java)
            startActivity(intento)
        }


    }
}