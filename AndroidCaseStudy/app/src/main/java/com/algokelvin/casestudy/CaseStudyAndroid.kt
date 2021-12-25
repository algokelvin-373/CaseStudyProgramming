package com.algokelvin.casestudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

fun <T> AppCompatActivity.removePreviousActivity(classActivity: Class<T>) {
    val intentRemove = Intent(this, classActivity)
    intentRemove.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
    startActivity(intentRemove)
}