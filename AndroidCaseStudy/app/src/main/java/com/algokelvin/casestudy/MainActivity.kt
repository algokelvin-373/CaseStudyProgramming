package com.algokelvin.casestudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.algokelvin.casestudy.cs01.CS01Activity
import com.algokelvin.casestudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCaseStudy01.setOnClickListener {
            startActivity(Intent(this, CS01Activity::class.java))
        }

    }
}