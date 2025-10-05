package com.example.miaplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.miaplication.Contract.MainContract
import com.example.miaplication.Presentadores.MainPresenter


class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnTriangulo = findViewById<Button>(R.id.btnTriangulo)
        val btnRectangulo = findViewById<Button>(R.id.btnRectangulo)
        val btnRombo = findViewById<Button>(R.id.btnRombo)
        val btnOctagono = findViewById<Button>(R.id.btnOctagono)

        presenter = MainPresenter(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnTriangulo.setOnClickListener {
            try {
                presenter.TrianguloClick()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        btnRectangulo.setOnClickListener {
            try {
                presenter.RectanguloClick()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        btnRombo.setOnClickListener {
            try {
                presenter.RomboClick()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        btnOctagono.setOnClickListener {
            try {
                presenter.OctagonoClick()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }



    }

    override fun navegarATriangulo() {
        val intent = Intent(this, TrianguloActivity::class.java)
        startActivity(intent)
    }

    override fun navegarARectangulo() {
        val intent = Intent(this, RectanguloActivity::class.java)
        startActivity(intent)
    }

    override fun navegarARombo() {
        val intent = Intent(this, RomboActivity::class.java)
        startActivity(intent)
    }

    override fun navegarAOctagono() {
        val intent = Intent(this, OctagonoActivity::class.java)
        startActivity(intent)
    }
}