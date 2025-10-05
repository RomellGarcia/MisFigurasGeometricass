package com.example.miaplication.Modelos

import com.example.miaplication.Contract.ContratoRectangulo

class RectanguloModelo : ContratoRectangulo.modelo {
    override fun area(l1: Float, l2: Float): Float {
        return l1*l2
    }

    override fun perimetro(l1: Float, l2: Float): Float {
        return 2 * (l1+l2)
    }


    override fun Valida(l1: Float, l2: Float, l3: Float, l4: Float): String {
        if (l1 <= 0 || l2 <= 0 || l3 <= 0 || l4 <= 0) {
            return "ERRORRR."
        }
        if (l1 == l2 && l2 == l3 && l3 == l4) {
            return "Es un cuadrado."
        } else if ((l1 == l3 && l2 == l4) || (l1 == l4 && l2 == l3)) {
            return "Es un rectangulo."
        } else {
            return "No es un rectangulo o cuadrado."
        }
    }
}