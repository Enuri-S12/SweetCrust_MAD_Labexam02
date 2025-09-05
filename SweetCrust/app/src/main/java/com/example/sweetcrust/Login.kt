package com.example.sweetcrust

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val starloginBtn = findViewById<Button>(R.id.signupbtn)

        starloginBtn.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val signup = findViewById<Button>(R.id.signuppage)

        signup.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

    }
}