package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }
    fun ktb1 (View: View) {
        val intent = Intent(this@MainActivity4,
            MainActivity5::class.java)
        startActivity(intent)
    }
    fun ktb2 (View: View) {
        val intent = Intent(this@MainActivity4,
            MainActivity7::class.java)
        startActivity(intent)
    }
    fun ktb3 (View: View) {
        val intent = Intent(this@MainActivity4,
            MainActivity8::class.java)
        startActivity(intent)
    }
    fun ktb4 (View: View) {
        val intent = Intent(this@MainActivity4,
            MainActivity2::class.java)
        startActivity(intent)
    }
}