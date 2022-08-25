package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.PraiseBtn)
        btn.setOnClickListener{
            Log.v( "Hello World", "Button Clicked" )
            Toast.makeText( this, "All Hail the Almighty Chinchilla!", Toast.LENGTH_SHORT ).show()
        }
    }
}