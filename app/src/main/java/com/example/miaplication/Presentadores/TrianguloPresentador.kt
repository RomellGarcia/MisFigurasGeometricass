package com.example.miaplication.Presentadores

import com.example.miaplication.Contract.ContratoTriangulo
import com.example.miaplication.Modelo.TrianguloModelo

class TrianguloPresentador(private val vista: ContratoTriangulo.Vista) : ContratoTriangulo.Presentador {

    private val modelo: ContratoTriangulo.Modelo = TrianguloModelo()

    override fun area(l1: Float, l2: Float, l3: Float) {
        if (modelo.valida(l1, l2, l3)) {
            val a = modelo.area(l1, l2, l3)
            vista.showArea(area = a)
        } else {
            vista.showError(msg = "DATOS NO VÁLIDOS")
        }
    }

    override fun perimetro(l1: Float, l2: Float, l3: Float) {
        if (modelo.valida(l1, l2, l3)) {
            val p = modelo.perimetro(l1, l2, l3)
            vista.showPerimetro(perimetro = p)
        } else {
            vista.showError(msg = "DATOS NO VÁLIDOS")
        }
    }

    override fun tipo(l1: Float, l2: Float, l3: Float) {
        if (modelo.valida(l1, l2, l3)) {
            val t = modelo.tipo(l1, l2, l3)
            vista.showTipo(tipo = t)
        } else {
            vista.showError(msg = "DATOS NO VÁLIDOS")
        }
    }
}