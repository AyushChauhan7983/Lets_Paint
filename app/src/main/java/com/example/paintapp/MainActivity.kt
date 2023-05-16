package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapp.PaintView.Companion.colorList
import com.example.paintapp.PaintView.Companion.currentBrush
import com.example.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redbtn = findViewById<ImageButton>(R.id.redColor)
        val bluebtn = findViewById<ImageButton>(R.id.blueColor)
        val greenbtn = findViewById<ImageButton>(R.id.greenColor)
        val yellowbtn = findViewById<ImageButton>(R.id.yellowColor)
        val blackbtn = findViewById<ImageButton>(R.id.blackColor)
        val eraser = findViewById<Button>(R.id.whiteColor)

        redbtn.setOnClickListener{
            paintBrush.setColor(Color.RED)
            currentColor(paintBrush.color)
        }

        bluebtn.setOnClickListener{
            paintBrush.setColor(Color.BLUE)
            currentColor(paintBrush.color)
        }

        greenbtn.setOnClickListener{
            paintBrush.setColor(Color.GREEN)
            currentColor(paintBrush.color)
        }

        yellowbtn.setOnClickListener{
            paintBrush.setColor(Color.YELLOW)
            currentColor(paintBrush.color)
        }

        blackbtn.setOnClickListener{
            paintBrush.setColor(Color.BLACK)
            currentColor(paintBrush.color)
        }

        eraser.setOnClickListener{
            pathList.clear()
            colorList.clear()
            path.reset()

        }
    }
    private fun currentColor(color:Int){
        currentBrush = color
        path = Path()
    }
}