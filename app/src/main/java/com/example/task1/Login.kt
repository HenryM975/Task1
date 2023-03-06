package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val logIn = findViewById<AppCompatButton>(R.id.buttonLogIn)
        logIn.setOnClickListener {
            val toPage1 = Intent(this, Page1::class.java)
            startActivity(toPage1)
        }
    }
}