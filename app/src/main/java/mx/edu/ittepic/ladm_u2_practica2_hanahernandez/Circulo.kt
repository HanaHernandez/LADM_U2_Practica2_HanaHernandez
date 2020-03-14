package mx.edu.ittepic.ladm_u2_practica2_hanahernandez

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint

class Circulo() {
    var x = 10f
    var y = 10f
    var radio = 0f
    var incXGrande = 5
    var incYGrande = 5
    var incXChico = 20
    var incYChico = 20

    constructor (x : Float, y : Float, radio : Int): this() {
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
    }

    fun dibujar ( c : Canvas, p : Paint) {

            c.drawCircle(x+radio,y+radio,radio,p)
    }

    fun cirGrande (ancho : Int, alto : Int){
        x += incXGrande
        if ( x <= -100 || x >= ancho ){
            incXGrande *= -1
        }
        y += incYGrande
        if ( y <= -100 || y >= alto){
            incYGrande *= -1
        }

    }

    fun cirChico( ancho: Int,alto: Int){
        x += incXChico
        if ( x <= -100 || x >= ancho){
            incXChico *= -1
        }
        y += incYChico
        if ( y <= -100 || y >= alto){
            incYChico *= -1
        }
    }
}