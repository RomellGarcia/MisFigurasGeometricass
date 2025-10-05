package com.example.miaplication.Contract

interface ContratoRombo {

    interface Modelo {
        fun calcularArea(dMayor: Float, dMenor: Float): Float
        fun calcularPerimetro(lado: Float): Float
        fun calcularAnguloInterno(dMayor: Float, dMenor: Float): Float
        fun validarDiagonales(dMayor: Float, dMenor: Float): Boolean
        fun validarLado(lado: Float): Boolean
    }

    interface Vista {
        fun mostrarArea(resultado: String)
        fun mostrarPerimetro(resultado: String)
        fun mostrarAnguloInterno(resultado: String)
        fun mostrarError(msg: String)
    }

    interface Presentador {
        fun calcularArea(dMayor: Float, dMenor: Float)
        fun calcularPerimetro(lado: Float)
        fun calcularAnguloInterno(dMayor: Float, dMenor: Float)
    }
}