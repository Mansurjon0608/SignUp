package com.example.signupphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signupphone.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()


        binding.txtGmail.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.txtMobilePhone.setOnClickListener {
            startActivity(Intent(this, PhoneActivity::class.java))
        }

        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.btnNext1.setOnClickListener {
        startActivity(Intent(this, PhoneActivity::class.java))
        }






    }
}