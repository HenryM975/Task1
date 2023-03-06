package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logIn = findViewById<AppCompatButton>(R.id.buttonLogIn)
        logIn.setOnClickListener {
            val toLogIn = Intent(this, Login::class.java)
            startActivity(toLogIn)
        }
        val signIn =  findViewById<AppCompatButton>(R.id.buttonSignIn)
        signIn.setOnClickListener {
            val toPage1 = Intent(this, Page1::class.java)
            startActivity(toPage1)
        }
    }
}