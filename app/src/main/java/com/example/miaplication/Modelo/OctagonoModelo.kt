package com.example.miaplication.Modelo

import com.example.miaplication.Contract.ContratoOctagono
import kotlin.math.PI
import kotlin.math.tan

class OctagonoModelo : ContratoOctagono.Modelo {

        override fun calcularArea(lado: Float): Float {
            val apotema = calcularApotema(lado)
            val perimetro = calcularPerimetro(lado)
            return (perimetro * apotema) / 2
        }

        override fun calcularPerimetro(lado: Float): Float {
            return 8 * lado
        }

        override fun calcularApotema(lado: Float): Float {
            val numeroLados = 8
            val anguloCentral = PI / numeroLados
            val apotema = lado / (2 * tan(anguloCentral))

            return apotema.toFloat()
        }

        override fun validarLado(lado: Float): Boolean {
            return lado > 0
        }
    }
