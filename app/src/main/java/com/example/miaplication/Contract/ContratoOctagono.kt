package com.example.miaplication.Contract

interface ContratoOctagono {

    interface Modelo {
        fun calcularArea(lado: Float): Float
        fun calcularPerimetro(lado: Float): Float
        fun calcularApotema(lado: Float): Float
        fun validarLado(lado: Float): Boolean
    }

    interface Vista {
        fun mostrarArea(resultado: String)
        fun mostrarPerimetro(resultado: String)
        fun mostrarApotema(resultado: String)
        fun mostrarError(msg: String)
    }

    interface Presentador {
        fun calcularArea(lado: Float)
        fun calcularPerimetro(lado: Float)
        fun calcularApotema(lado: Float)
    }

}