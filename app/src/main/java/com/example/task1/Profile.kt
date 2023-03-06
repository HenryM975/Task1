package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val logOut = findViewById<AppCompatButton>(R.id.buttonLogOut)
        logOut.setOnClickListener {
            val toSignIn = Intent(this, MainActivity::class.java)
            startActivity(toSignIn)
        }
    }
}