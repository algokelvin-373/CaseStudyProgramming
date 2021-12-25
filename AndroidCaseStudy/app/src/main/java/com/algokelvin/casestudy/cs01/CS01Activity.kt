package com.algokelvin.casestudy.cs01

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.algokelvin.casestudy.MainActivity
import com.algokelvin.casestudy.databinding.ActivityCaseStudy01Binding
import com.algokelvin.casestudy.removePreviousActivity

class CS01Activity: AppCompatActivity() {
    private lateinit var binding: ActivityCaseStudy01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCaseStudy01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var pages = intent.getIntExtra("pages", 0)
        binding.pages.text = pages.toString()

        binding.btnNext.setOnClickListener {
            pages++
            val intentNextPage = Intent(this, CS01Activity::class.java)
            intentNextPage.putExtra("pages", pages)
            startActivity(intentNextPage)
        }
        binding.btnFinish.setOnClickListener {
            removePreviousActivity(MainActivity::class.java)
        }

    }
}