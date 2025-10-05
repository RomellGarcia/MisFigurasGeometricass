package com.example.miaplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.miaplication.Contract.ContratoTriangulo
import com.example.miaplication.Presentadores.TrianguloPresentador

class TrianguloActivity : AppCompatActivity(), ContratoTriangulo.Vista {

    private lateinit var txvRes: TextView
    private lateinit var presentador: ContratoTriangulo.Presentador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangulo)

        val txtl1 = findViewById<EditText>(R.id.edtLadoA)
        val txtl2 = findViewById<EditText>(R.id.edtLadoB)
        val txtl3 = findViewById<EditText>(R.id.edtLadoC)

        val btnArea = findViewById<Button>(R.id.btnArea)
        val btnPerimetro = findViewById<Button>(R.id.btnPerimetro)
        val btnTipo = findViewById<Button>(R.id.btnTipo)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        txvRes = findViewById<TextView>(R.id.txvResultado)


        presentador = TrianguloPresentador(this)

        btnPerimetro.setOnClickListener {
            try {
                val l1 = txtl1.text.toString().toFloat()
                val l2 = txtl2.text.toString().toFloat()
                val l3 = txtl3.text.toString().toFloat()
                presentador.perimetro(l1, l2, l3)
            } catch (e: NumberFormatException) {
                showError("Ingresa números válidos")
            }
        }

        btnArea.setOnClickListener {
            try {
                val l1 = txtl1.text.toString().toFloat()
                val l2 = txtl2.text.toString().toFloat()
                val l3 = txtl3.text.toString().toFloat()
                presentador.area(l1, l2, l3)
            } catch (e: NumberFormatException) {
                showError("Ingresa números válidos")
            }
        }

        btnTipo.setOnClickListener {
            try {
                val l1 = txtl1.text.toString().toFloat()
                val l2 = txtl2.text.toString().toFloat()
                val l3 = txtl3.text.toString().toFloat()
                presentador.tipo(l1, l2, l3)
            } catch (e: NumberFormatException) {
                showError("Ingresa números válidos")
            }
        }

        btnRegresar.setOnClickListener {
            finish()
        }
    }

    override fun showArea(area: Float) { // Cambié a Float
        txvRes.text = "El área es: ${String.format("%.2f", area)}"
    }

    override fun showPerimetro(perimetro: Float) { // Cambié a Float
        txvRes.text = "El perímetro es: ${String.format("%.2f", perimetro)}"
    }

    override fun showTipo(tipo: String) {
        txvRes.text = "El tipo de triángulo es: $tipo"
    }

    override fun showError(msg: String) {
        txvRes.text = "Error: $msg"
    }
}