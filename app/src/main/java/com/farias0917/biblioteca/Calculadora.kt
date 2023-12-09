package com.farias0917.biblioteca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val numero1 = findViewById<EditText>(R.id.editTextNumero1)
        val numero2= findViewById<EditText>(R.id.editTextNumero2)
        val op = findViewById<EditText>(R.id.editTextOp)
        val btnCalcular = findViewById<Button>(R.id.botonCalcular)
        val resultado = findViewById<TextView>(R.id.textViewResultado)

        resultado.setText("")

        btnCalcular.setOnClickListener {
            //Toast.makeText(this, "El número ingresado es ${numero1.text.toString()}", Toast.LENGTH_LONG).show()
            //resultado.setText("El número ingresado es ${numero1.text.toString()}")

            val num1Srt = numero1.text.toString()
            val num2Str = numero2.text.toString()
            val opText = op.text.toString()

            if(num1Srt.equals("") || num2Str.equals("") || opText.equals("")){
                Toast.makeText(this, "No pueden quedar campos vacios!!", Toast.LENGTH_LONG).show()
            }else{
                val num1 = num1Srt.toInt()
                val num2 = num2Str.toInt()

                when(opText){
                    "+" -> resultado.setText("El resultado de la suma es ${sumar(num1,num2)}")
                    "-" -> resultado.setText("El resultado de la resta es ${restar(num1,num2)}")
                    "*" -> resultado.setText("El resultado de la mutiplicación es ${multiplicar(num1,num2)}")
                    "/" -> resultado.setText("El resultado de la división es ${dividir(num1,num2)}")
                    else -> Toast.makeText(this, "Error, operador no válido", Toast.LENGTH_LONG).show()

                }
            }
        }

    }

    fun sumar(num1:Int, num2:Int):Int{
        return num1 + num2
    }

    fun restar(num1:Int, num2:Int):Int{
        return num1 - num2
    }

    fun multiplicar(num1:Int, num2:Int):Int{
        return num1 * num2
    }

    fun dividir(num1:Int, num2:Int):Int{
        return num1 / num2
    }
}