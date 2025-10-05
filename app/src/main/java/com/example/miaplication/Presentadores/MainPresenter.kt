package com.example.miaplication.Presentadores

import com.example.miaplication.Contract.MainContract

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    override fun OctagonoClick() {
        view.navegarAOctagono()
    }
    override fun RectanguloClick() {
        view.navegarARectangulo()
    }

    override fun TrianguloClick() {
        view.navegarATriangulo()
    }

    override fun RomboClick() {
        view.navegarARombo()
    }

}