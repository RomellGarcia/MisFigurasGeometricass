package com.example.miaplication.Modelo

import com.example.miaplication.Contract.ContratoRombo
import kotlin.math.atan

class ModeloRombo : ContratoRombo.Modelo {

    override fun calcularArea(dMayor: Float, dMenor: Float): Float {
        return (dMayor * dMenor) / 2
    }

    override fun calcularPerimetro(lado: Float): Float {
        return 4 * lado
    }

    override fun calcularAnguloInterno(dMayor: Float, dMenor: Float): Float {
        val proporcion = dMenor / dMayor
        val anguloRadianes = 2 * atan(proporcion)
        val anguloGrados = anguloRadianes * (180 / Math.PI)
        return anguloGrados.toFloat()
    }

    override fun validarDiagonales(dMayor: Float, dMenor: Float): Boolean {
        return dMayor > 0 && dMenor > 0 && dMayor > dMenor
    }

    override fun validarLado(lado: Float): Boolean {
        return lado > 0
    }
}