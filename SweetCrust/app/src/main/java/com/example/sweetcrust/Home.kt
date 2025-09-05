package com.example.sweetcrust

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.sweetcrust.Adapter.ImagePagerAdapter
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val viewPager = findViewById<ViewPager2>(R.id.viewPager2)


        val images = listOf(R.drawable.image1, R.drawable.image2)

        val adapter = ImagePagerAdapter(images)
        viewPager.adapter = adapter

        val dotsIndicator = findViewById<DotsIndicator>(R.id.dotIndicator)
        dotsIndicator.attachTo(viewPager)
        dotsIndicator.visibility = View.VISIBLE


        //to best seller cake page
        val imageView = findViewById<ImageView>(R.id.cake1)

        imageView.setOnClickListener {
            val intent = Intent(this, Productdetails::class.java)
            startActivity(intent)
        }


        val btncake = findViewById<ImageView>(R.id.button1)

        btncake.setOnClickListener {
            val intent = Intent(this, Cakespage::class.java)
            startActivity(intent)
        }


        //navbar_profile
        val profile =findViewById<ImageView>(R.id.nav_profile)

        profile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }


        //navbar_cart
        val cart = findViewById<ImageView>(R.id.nav_cart)
        cart.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}