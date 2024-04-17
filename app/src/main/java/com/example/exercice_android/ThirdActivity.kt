package com.example.exercice_android

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val user: User? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            Log.i("Problemes","Je sus dans le tiramisu")
            intent.getParcelableExtra("user", User::class.java)
        } else {
            Log.i("Problemes","Je suis depreciate")
            intent.getParcelableExtra("user")
        }

        findViewById<TextView>(R.id.name)?.text = user?.name
        findViewById<TextView>(R.id.job)?.text = user?.job
        findViewById<TextView>(R.id.company)?.text = user?.company

    }
}