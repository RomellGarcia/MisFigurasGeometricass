package com.example.miaplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.miaplication.Contract.ContratoOctagono
import com.example.miaplication.Presentadores.OctagonoPresentador

class OctagonoActivity : AppCompatActivity(), ContratoOctagono.Vista{
    private lateinit var txvResultado: TextView
    private lateinit var presentador: ContratoOctagono.Presentador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_octagono)


        val edtLado = findViewById<EditText>(R.id.edtLado)
        val btnArea = findViewById<Button>(R.id.btnArea)
        val btnPerimetro = findViewById<Button>(R.id.btnPerimetro)
        val btnApotema = findViewById<Button>(R.id.btnApotema)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        txvResultado = findViewById<TextView>(R.id.txvResultado)

        presentador = OctagonoPresentador(this)

        btnArea.setOnClickListener {
            try {
                val lado = edtLado.text.toString().toFloat()
                presentador.calcularArea(lado)
            } catch (e: NumberFormatException) {
                mostrarError("Ingresa un valor válido para el lado")
            }
        }

        btnPerimetro.setOnClickListener {
            try {
                val lado = edtLado.text.toString().toFloat()
                presentador.calcularPerimetro(lado)
            } catch (e: NumberFormatException) {
                mostrarError("Ingresa un valor válido para el lado")
            }
        }

        btnApotema.setOnClickListener {
            try {
                val lado = edtLado.text.toString().toFloat()
                presentador.calcularApotema(lado)
            } catch (e: NumberFormatException) {
                mostrarError("Ingresa un valor válido para el lado")
            }
        }

        btnRegresar.setOnClickListener {
            finish()
        }
    }

    override fun mostrarArea(resultado: String) {
        txvResultado.text = resultado
    }

    override fun mostrarPerimetro(resultado: String) {
        txvResultado.text = resultado
    }

    override fun mostrarApotema(resultado: String) {
        txvResultado.text = resultado
    }

    override fun mostrarError(mensaje: String) {
        txvResultado.text = "$mensaje"
    }
}