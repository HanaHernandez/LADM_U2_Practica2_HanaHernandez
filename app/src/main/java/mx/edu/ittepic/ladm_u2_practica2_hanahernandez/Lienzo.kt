package mx.edu.ittepic.ladm_u2_practica2_hanahernandez

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

import android.view.View

class Lienzo( p : MainActivity) : View(p) {
    var puntero = p


    //circulo chicos
    var cChico1 = Circulo(100f,50f,30)
    var cChico2 = Circulo(250f,100f,40)
    var cChico3 = Circulo(500f,800f,50)
    var cChico4 = Circulo(600f,700f,60)
    var cChico5 = Circulo(500f,900f,70)
    //circulos grandes
    var cGrande1 = Circulo(300f,50f,100)
    var cGrande2 = Circulo(700f,800f,200)
    var cGrande3 = Circulo(400f,500f,300)
    //
    var cir : Circulo?= null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()


        //Circulo chico1
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLACK
        paint.strokeWidth = 5f
        cChico1.dibujar(canvas,paint)
        //Circulo chico2
        paint.style = Paint.Style.STROKE
        paint.color = Color.BLUE
        paint.strokeWidth = 5f
        cChico2.dibujar(canvas,paint)
        //Circulo chico3
        paint.style = Paint.Style.STROKE
        paint.color = Color.CYAN
        paint.strokeWidth = 5f
        //Circulo chico4
        paint.style = Paint.Style.STROKE
        paint.color = Color.YELLOW
        paint.strokeWidth = 5f
        cChico4.dibujar(canvas,paint)
        //Circulo chico5
        paint.style = Paint.Style.STROKE
        paint.color = Color.GREEN
        paint.strokeWidth = 5f
        cChico5.dibujar(canvas,paint)

        //Circulo grande1
        paint.style = Paint.Style.STROKE
        paint.color = Color.GRAY
        paint.strokeWidth = 5f
        cGrande1.dibujar(canvas,paint)
        //Circulo grande2
        paint.style = Paint.Style.STROKE
        paint.color = Color.MAGENTA
        paint.strokeWidth = 5f
        cGrande2.dibujar(canvas,paint)
        //Circulo grande3
        paint.style = Paint.Style.STROKE
        paint.color = Color.RED
        paint.strokeWidth = 5f
        cGrande3.dibujar(canvas,paint)


    }

    fun animar(){
        cChico1.cirChico(width,height)
        cChico2.cirChico(width,height)
        cChico3.cirChico(width,height)
        cChico4.cirChico(width,height)
        cChico5.cirChico(width,height)
        cGrande1.cirGrande(width,height)
        cGrande2.cirGrande(width,height)
        cGrande3.cirGrande(width,height)

        invalidate()
    }
}