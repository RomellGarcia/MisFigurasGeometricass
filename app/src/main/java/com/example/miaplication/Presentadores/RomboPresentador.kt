package com.example.miaplication.Presentadores

import com.example.miaplication.Modelo.ModeloRombo

import com.example.miaplication.Contract.ContratoRombo

class RomboPresentador(private val vista: ContratoRombo.Vista) : ContratoRombo.Presentador {
    private val modelo: ContratoRombo.Modelo = ModeloRombo()

    override fun calcularArea(dMayor: Float, dMenor: Float) {
        if (!modelo.validarDiagonales(dMayor, dMenor)) {
            vista.mostrarError("Las diagonales deben ser positivas y la diagonal mayor debe ser mas grande que la menor")
            return
        }

        try {
            val area = modelo.calcularArea(dMayor, dMenor)
            vista.mostrarArea("Area del rombo: ${String.format("%.2f", area)} unidades²")
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
            vista.mostrarPerimetro("Perimetro del rombo: ${String.format("%.2f",perimetro)} unidades"
            )
        } catch (e: Exception) {
            vista.mostrarError("Error al calcular el perimetro: ${e.message}")
        }
    }

    override fun calcularAnguloInterno(dMayor: Float, dMenor: Float) {
        if (!modelo.validarDiagonales(dMayor, dMenor)) {
            vista.mostrarError("Las diagonales deben ser positivas y la diagonal mayor debe ser más grande que la menor")
            return
        }

        try {
            val angulo = modelo.calcularAnguloInterno(dMayor, dMenor)
            vista.mostrarAnguloInterno("Angulo interno: ${String.format("%.2f", angulo)}°")
        } catch (e: Exception) {
            vista.mostrarError("Error al calcular el angulo: ${e.message}")
        }
    }
}
