package com.example.sweetcrust

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        val signup = findViewById<Button>(R.id.signupbtn)

        signup.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val tologin = findViewById<Button>(R.id.loginpage)

        tologin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }
}