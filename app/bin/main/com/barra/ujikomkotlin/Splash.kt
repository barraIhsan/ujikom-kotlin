package com.barra.ujikomkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {

    // Membuat variable untuk berapa lama splash screennya muncul (milisecond)
    private val splashTime = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Setelah delay selama slashTime variable
        Handler().postDelayed({
            // Maka pindah ke activity Login
            startActivity(Intent(this, Login::class.java))
            finish()
        }, splashTime)
    }
}