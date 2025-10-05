package com.example.miaplication.Presentadores

import com.example.miaplication.Contract.ContratoOctagono
import com.example.miaplication.Modelo.OctagonoModelo

class OctagonoPresentador(private val vista: ContratoOctagono.Vista): ContratoOctagono.Presentador {


        private val modelo: ContratoOctagono.Modelo = OctagonoModelo()

        override fun calcularArea(lado: Float) {
            if (!modelo.validarLado(lado)) {
                vista.mostrarError("El lado debe ser un número positivo")
                return
            }

            try {
                val area = modelo.calcularArea(lado)
                vista.mostrarArea("Area del octagono: ${String.format("%.2f", area)} unidades²")
            } catch (e: Exception) {
                vista.mostrarError("Error al calcular el area: ${e.message}")
            }
        }

        override fun calcularPerimetro(lado: Float) {
            if (!modelo.validarLado(lado)) {
                vista.mostrarError("El lado debe ser un numero positivo")
                return
            }

            try {
                val perimetro = modelo.calcularPerimetro(lado)
                vista.mostrarPerimetro("Perimetro del octagono: ${String.format("%.2f", perimetro)} unidades")
            } catch (e: Exception) {
                vista.mostrarError("Error al calcular el perimetro: ${e.message}")
            }
        }

        override fun calcularApotema(lado: Float) {
            if (!modelo.validarLado(lado)) {
                vista.mostrarError("El lado debe ser un numero positivo")
                return
            }

            try {
                val apotema = modelo.calcularApotema(lado)
                vista.mostrarApotema("Apotema del octagono: ${String.format("%.2f", apotema)} unidades")
            } catch (e: Exception) {
                vista.mostrarError("Error al calcular el apotema: ${e.message}")
            }
        }
    }