package com.example.miaplication.Modelo

import com.example.miaplication.Contract.ContratoTriangulo
import kotlin.math.sqrt

class TrianguloModelo : ContratoTriangulo.Modelo {
    override fun area(l1: Float, l2: Float, l3: Float): Float {
        val s=(l1+l2+l3)/2
        return sqrt(x=s*(s-l1)*(s-l2)*(s-l3))
    }

    override fun perimetro(l1: Float, l2: Float, l3: Float): Float {
        return l1+l2+l3
    }

    override fun tipo(l1: Float, l2: Float, l3: Float): String {
        if (l1==l2 && l2==l3)
            return "Equilatero"
        else if(l1!=l2 && l2!=l3 && l3!=l1)
            return "Escaleno"
        else
            return "Isoceles"
    }

    override fun valida(l1: Float, l2: Float, l3: Float): Boolean {
        if(l1+l2>l3 && l1+l3>l2 && l2+l3>l1)
            return true
        else
            return false
    }

}