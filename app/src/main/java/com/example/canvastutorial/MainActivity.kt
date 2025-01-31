package com.example.canvastutorial

import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        val myCanvas = CanvasView(this)
        setContentView(myCanvas)




        val view = window.decorView
            .findViewById<ViewGroup>(android.R.id.content)
            .getChildAt(0)



    }
}