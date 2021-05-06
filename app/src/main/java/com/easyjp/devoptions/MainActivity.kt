package com.easyjp.devoptions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val dev = Intent("com.android.settings.APPLICATION_DEVELOPMENT_SETTINGS")
        startActivity(dev)

        finish()
    }
}