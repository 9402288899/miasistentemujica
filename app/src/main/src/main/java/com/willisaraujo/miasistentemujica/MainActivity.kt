package com.willisaraujo.miasistentemujica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val statusText = findViewById<TextView>(R.id.statusText)
        val btnActivar = findViewById<Button>(R.id.btnActivar)

        statusText.text = "SISTEMA MUJICA CORE CORE\nWILLIS ARAUJO SYSTEM 2026\nCONEXION: NEURONAL LISTA"

        btnActivar.setOnClickListener {
            val intent = Intent(android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS)
            startActivity(intent)
        }
    }
}
