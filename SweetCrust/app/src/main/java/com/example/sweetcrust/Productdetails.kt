package com.example.sweetcrust

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.imageview.ShapeableImageView


class Productdetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productdetails)


        val imagebtn = findViewById<ShapeableImageView>(R.id.cakesbackbtn)

        imagebtn.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val cartbtn = findViewById<Button>(R.id.Cartbtn)

        cartbtn.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }





}