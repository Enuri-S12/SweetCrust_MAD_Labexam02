package com.example.sweetcrust

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Cakespage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cakespage)

        val backtohome = findViewById<ImageView>(R.id.cakesbackbtn)

        backtohome.setOnClickListener(){
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

    }
}