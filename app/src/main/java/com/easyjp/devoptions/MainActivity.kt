package com.easyjp.devoptions

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dev = Intent("com.android.settings.APPLICATION_DEVELOPMENT_SETTINGS")
        startActivity(dev)

        finish()
    }
}