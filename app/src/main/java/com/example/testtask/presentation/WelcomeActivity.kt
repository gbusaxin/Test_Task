package com.example.testtask.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.testtask.R

class WelcomeActivity : AppCompatActivity() {

    companion object{
        const val SPLASH_TIME:Long = 3000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        Handler().postDelayed({
            startActivity(Intent(this@WelcomeActivity,MainActivity::class.java))
            finish()
        } , SPLASH_TIME)
    }
}

