package mx.edu.ittepic.ladm_u2_practica2_emmanuelhuizar

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import java.util.Random

class Lienzo(p:MainActivity) : View(p) {
    var r = Random()
    var puntero = p

    var circulo = FiguraGeometrica(r.nextInt(400), r.nextInt(1500),r.nextInt(300))
    var circulo1 = FiguraGeometrica(r.nextInt(400), r.nextInt(1500),r.nextInt(300))
    var circulo2 = FiguraGeometrica(r.nextInt(400), r.nextInt(1500),r.nextInt(300))
    var circulo3 = FiguraGeometrica(r.nextInt(400), r.nextInt(1500),r.nextInt(300))
    var circulo4 = FiguraGeometrica(r.nextInt(400), r.nextInt(1500),r.nextInt(300))
    var circulo5 = FiguraGeometrica(r.nextInt(400), r.nextInt(1500),r.nextInt(300))
    var circulo6 = FiguraGeometrica(r.nextInt(400), r.nextInt(1500),r.nextInt(300))
    var circulo7 = FiguraGeometrica(r.nextInt(400), r.nextInt(1500),r.nextInt(300))
    var circulo8 = FiguraGeometrica(r.nextInt(400), r.nextInt(1500),r.nextInt(300))
    var circulo9 = FiguraGeometrica(r.nextInt(400), r.nextInt(1500),r.nextInt(300))

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()
        canvas.drawColor(Color.BLACK)
        paint.color = Color.rgb(r.nextInt(255),r.nextInt(10),r.nextInt(10))
        circulo.pintar(canvas, paint)
        circulo1.pintar(canvas, paint)
        circulo2.pintar(canvas, paint)
        paint.color = Color.rgb(r.nextInt(10),r.nextInt(255),r.nextInt(10))
        circulo3.pintar(canvas, paint)
        circulo4.pintar(canvas, paint)
        circulo5.pintar(canvas, paint)
        paint.color = Color.rgb(r.nextInt(10),r.nextInt(10),r.nextInt(255))
        circulo6.pintar(canvas, paint)
        circulo7.pintar(canvas, paint)
        circulo8.pintar(canvas, paint)
        circulo9.pintar(canvas, paint)
    }

    fun animarCirculo() {
        circulo.rebote(width, height)
        circulo1.rebote(width, height)
        circulo2.rebote(width, height)
        circulo3.rebote(width, height)
        circulo4.rebote(width, height)
        circulo5.rebote(width, height)
        circulo6.rebote(width, height)
        circulo7.rebote(width, height)
        circulo8.rebote(width, height)
        circulo9.rebote(width, height)

        invalidate()
    }
}