package com.example.miaplication.Contract

interface ContratoRectangulo {
    interface modelo{
        fun area(l1:Float,l2:Float): Float
        fun perimetro(l1:Float,l2:Float): Float
        fun Valida(l1:Float,l2:Float,l3: Float,l4: Float): String
    }

    interface vista{
        fun showArea(area:Float)
        fun showPerimetro(perimetro:Float)
        fun showValida(validacion : String)
        fun showError(msg:String)
    }

    interface Presentador{
        fun area(l1:Float,l2:Float,l3: Float,l4: Float)
        fun perimetro(l1:Float,l2:Float,l3: Float,l4: Float)
        fun valida(l1:Float,l2:Float,l3: Float,l4: Float)
    }
}