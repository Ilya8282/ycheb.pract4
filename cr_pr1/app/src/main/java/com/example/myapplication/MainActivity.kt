package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.window.SplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.imageView4).apply {
            setBackgroundResource(R.drawable.animation)
            val download = background as AnimationDrawable
            download.start()
            scheduleSplashScreen()

        }
    }

    private fun scheduleSplashScreen() {
        val splashScreenDuration: Long = 3000

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity,
                MainActivity2::class.java)
            startActivity(intent)
            finish()
        }, splashScreenDuration)
    }


}