package com.example.signupphone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Done : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}