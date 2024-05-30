package com.example.tixid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val film = findViewById<Button>(R.id.film)
        val bio = findViewById<Button>(R.id.bio)

        film.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
        bio.setOnClickListener {
            val intent = Intent (this, bioskop::class.java)
            startActivity(intent)
        }
    }
}