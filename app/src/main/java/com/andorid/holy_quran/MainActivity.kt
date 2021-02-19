package com.andorid.holy_quran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Display.FLAG_SECURE
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getWindow().setFlags(
            WindowManager.LayoutParams
                    .FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)

        Handler().postDelayed(Runnable {
            OpenSplash()
            finish()
        },2000)

    }
    fun OpenSplash(){
       val intent= Intent(this@MainActivity,HomeScreen::class.java)
        startActivity(intent)
    }
}