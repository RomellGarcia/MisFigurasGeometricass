package com.example.miaplication.Contract

interface MainContract {
    interface View {
        fun navegarATriangulo()
        fun navegarARectangulo()
        fun navegarARombo()
        fun navegarAOctagono()
    }

    interface Presenter {
        fun TrianguloClick()
        fun RectanguloClick()
        fun RomboClick()
        fun OctagonoClick()
    }

}