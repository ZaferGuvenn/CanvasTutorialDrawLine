package com.example.canvastutorial

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.MotionEvent
import android.view.View


class CanvasView(context: Context) : View(context) {

    var rect: Rect? = null
    var paint = Paint()
    var xPos1: Float = 32f
    var yPos1: Float = 444f
    var xPos2: Float = 222f
    var yPos2: Float = 3f
    var point: Int = 1

    lateinit var myCanvas : Canvas

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Init stuff here
        paint.apply {
            strokeWidth = 10f
            style = Paint.Style.FILL_AND_STROKE
            color = Color.BLUE
        }

        canvas.drawLine(
            xPos1,
            yPos1,
            xPos2,
            yPos2,
            paint)
        //canvas.drawLine(200f, 150f, 20f, 35f, paint)
    }



    override fun onTouchEvent(event: MotionEvent?): Boolean {

        event?.let {


            println(it.action)
            when(it.action){


                MotionEvent.ACTION_DOWN->{

                    xPos2 = 0f
                    yPos2 = 0f

                    xPos1 = it.x
                    yPos1 = it.y
                }

                MotionEvent.ACTION_UP->{

                }

                MotionEvent.ACTION_MOVE->{

                    xPos2 = it.x
                    yPos2 = it.y


                    invalidate()
                }

            }
        }


        return true
    }

}