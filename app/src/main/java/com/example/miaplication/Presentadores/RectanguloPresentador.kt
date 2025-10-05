package com.example.miaplication.Presentadores

import com.example.miaplication.Contract.ContratoRectangulo
import com.example.miaplication.Modelos.RectanguloModelo

class RectanguloPresentador(private val vista: ContratoRectangulo.vista): ContratoRectangulo.Presentador {
    private val modelo: ContratoRectangulo.modelo = RectanguloModelo()


    override fun area(l1: Float, l2: Float,l3: Float,l4: Float) {
        val tipo = modelo.Valida(l1, l2, l3, l4)
        if (tipo == "Es un rectangulo.") {
            val area = modelo.area(l1, l2)
            vista.showArea(area)
        } else if (tipo == "Es un cuadrado.") {
            vista.showError("No se puede calcular el area, solo rectangulos")
        } else {
            vista.showError("No se puede calcular el area, solo rectangulos")
        }
    }

    override fun perimetro(l1: Float, l2: Float, l3: Float,l4: Float) {
        val tipo = modelo.Valida(l1, l2, l3, l4)
        if (tipo == "Es un rectangulo.") {
            val perimetro = modelo.perimetro(l1, l2)
            vista.showPerimetro(perimetro)
        } else if (tipo == "Es un cuadrado.") {
            vista.showError("No se puede calcular el area, solo rectangulos")
        } else {
            vista.showError("No se puede calcular el area, solo rectangulos")
        }
    }


    override fun valida(l1: Float, l2: Float, l3: Float, l4: Float) {
        val tipo = modelo.Valida(l1,l2, l3, l4)
        if (tipo == "No es un rectangulo o cuadrado." || tipo == "Las medidas deben ser numeros positivos.") {
            vista.showError(tipo)
        } else {
            vista.showValida(tipo)
        }
    }
}