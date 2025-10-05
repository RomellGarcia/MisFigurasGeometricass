package com.example.miaplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.miaplication.Presentadores.RomboPresentador
import com.example.miaplication.Contract.ContratoRombo

class RomboActivity : AppCompatActivity(), ContratoRombo.Vista {
        private lateinit var txvResultado: TextView
        private lateinit var presentador: ContratoRombo.Presentador

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_rombo)

            val edtDiagonalMayor = findViewById<EditText>(R.id.edtDiagonalMayor)
            val edtDiagonalMenor = findViewById<EditText>(R.id.edtDiagonalMenor)
            val edtLado = findViewById<EditText>(R.id.edtLado)

            val btnArea = findViewById<Button>(R.id.btnArea)
            val btnPerimetro = findViewById<Button>(R.id.btnPerimetro)
            val btnAngulo = findViewById<Button>(R.id.btnAngulo)
            val btnRegresar = findViewById<Button>(R.id.btnRegresar)

            txvResultado = findViewById<TextView>(R.id.txvResultado)

            presentador = RomboPresentador(this)

            btnArea.setOnClickListener {
                try {
                    val dMayor = edtDiagonalMayor.text.toString().toFloat()
                    val dMenor = edtDiagonalMenor.text.toString().toFloat()
                    presentador.calcularArea(dMayor, dMenor)
                } catch (e: NumberFormatException) {
                    mostrarError("Ingresa valores válidos para las diagonales")
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

            btnAngulo.setOnClickListener {
                try {
                    val dMayor = edtDiagonalMayor.text.toString().toFloat()
                    val dMenor = edtDiagonalMenor.text.toString().toFloat()
                    presentador.calcularAnguloInterno(dMayor, dMenor)
                } catch (e: NumberFormatException) {
                    mostrarError("Ingresa valores válidos para las diagonales")
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

        override fun mostrarAnguloInterno(resultado: String) {
            txvResultado.text = resultado
        }

    override fun mostrarError(msg: String) {
        txvResultado.text = "Error:  $msg"
    }
}