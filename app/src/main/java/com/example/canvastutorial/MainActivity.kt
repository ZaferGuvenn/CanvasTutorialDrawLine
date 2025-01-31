package com.example.canvastutorial

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.graphics.Canvas
import android.graphics.Rect
import android.widget.ImageView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        val myCanvas = SpotlightDialogFragment(this)
        setContentView(myCanvas)




        val view = window.decorView
            .findViewById<ViewGroup>(android.R.id.content)
            .getChildAt(0)



    }
}