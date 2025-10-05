package com.example.miaplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.miaplication.Contract.ContratoRectangulo
import com.example.miaplication.Presentadores.RectanguloPresentador

class RectanguloActivity : AppCompatActivity(), ContratoRectangulo.vista {

    private lateinit var txvRes: TextView
    private lateinit var presentador: ContratoRectangulo.Presentador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangulo)

        val txtLado1 = findViewById<EditText>(R.id.edtLado1)
        val txtLado2 = findViewById<EditText>(R.id.edtLado2)
        val txtLado3 = findViewById<EditText>(R.id.edtLado3)
        val txtLado4 = findViewById<EditText>(R.id.edtLado4)

        val btnArea = findViewById<Button>(R.id.btnArea)
        val btnPerimetro = findViewById<Button>(R.id.btnPerimetro)
        val btnValidar = findViewById<Button>(R.id.btnValidar)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        txvRes = findViewById<TextView>(R.id.txvResultado)
        presentador = RectanguloPresentador(this)

        btnArea.setOnClickListener {
            try {
                val l1 = txtLado1.text.toString().toFloat()
                val l2 = txtLado2.text.toString().toFloat()
                val l3 = txtLado3.text.toString().toFloat()
                val l4 = txtLado4.text.toString().toFloat()
                presentador.area(l1, l2, l3, l4)
            } catch (e: NumberFormatException) {
                showError("Ingresa números válidos en todos los campos")
            }
        }

        btnPerimetro.setOnClickListener {
            try {
                val l1 = txtLado1.text.toString().toFloat()
                val l2 = txtLado2.text.toString().toFloat()
                val l3 = txtLado3.text.toString().toFloat()
                val l4 = txtLado4.text.toString().toFloat()
                presentador.perimetro(l1, l2, l3, l4)
            } catch (e: NumberFormatException) {
                showError("Ingresa números válidos en todos los campos")
            }
        }

        btnValidar.setOnClickListener {
            try {
                val l1 = txtLado1.text.toString().toFloat()
                val l2 = txtLado2.text.toString().toFloat()
                val l3 = txtLado3.text.toString().toFloat()
                val l4 = txtLado4.text.toString().toFloat()
                presentador.valida(l1, l2, l3, l4)
            } catch (e: NumberFormatException) {
                showError("Ingresa números válidos en todos los campos")
            }
        }

        btnRegresar.setOnClickListener {
            finish()
        }
    }

    override fun showArea(area: Float) {
        txvRes.text = "Área: ${String.format("%.2f", area)} unidades²"
    }

    override fun showPerimetro(perimetro: Float) {
        txvRes.text = "Perímetro: ${String.format("%.2f", perimetro)} unidades"
    }

    override fun showValida(validacion: String) {
        txvRes.text = validacion
    }

    override fun showError(msg: String) {
        txvRes.text = "Error: $msg"
    }
}