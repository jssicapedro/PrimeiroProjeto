package com.example.primeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btncalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso = findViewById<TextView>(R.id.edtPeso)
        val altura = findViewById<TextView>(R.id.edtAltura)
        val tResult = findViewById<TextView>(R.id.tResult)

        btncalcular = findViewById(R.id.btncalcular)

        btncalcular.setOnClickListener{

            val peso = peso.text.toString().toDouble()
            val altura = altura.text.toString().toDouble()
            val resultado = peso/ (altura * altura)
            val resultadoFormatado = String.format("%.2f", resultado)

            tResult.text = "O teu IMC é de $resultadoFormatado"
        }
    }
}