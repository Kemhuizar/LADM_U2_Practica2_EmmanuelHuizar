package mx.edu.ittepic.ladm_u2_practica2_emmanuelhuizar

import android.graphics.Canvas
import android.graphics.Paint

class FiguraGeometrica () {
    var x = 0f
    var y = 0f
    var radio = 0f
    var incY=1f
    var incX=1f

    constructor(x:Int, y:Int, radio:Int) : this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        if(radio<=250){
            this.incY=5f
            this.incX=5f
            if(radio<=200){
                this.incY=10f
                this.incX=10f
                if(radio<=150){
                    this.incY=20f
                    this.incX=20f
                    if(radio<=100){
                        this.incY=30f
                        this.incX=30f
                        if(radio<=50){
                            this.incY=50f
                            this.incX=50f
                        }
                    }
                }
            }
        }

        this.radio = radio.toFloat()
    }

    fun pintar(c: Canvas, p: Paint){
        c.drawCircle(x+radio,y+radio,radio,p)
    }

    fun rebote(ancho:Int, alto:Int){
        x+= incX
        if(x<=0 || x>=ancho-radio*2){
            incX *= -1
        }
        y+= incY
        if(y<=0 || y>=alto-radio*2){
            incY *= -1
        }
    }
}