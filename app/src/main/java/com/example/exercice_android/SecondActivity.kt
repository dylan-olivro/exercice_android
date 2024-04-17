package com.example.exercice_android

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val user: User? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("user", User::class.java)
        } else {
            intent.getParcelableExtra("user")
        }

        findViewById<TextView>(R.id.name)?.text = user?.name
        findViewById<TextView>(R.id.job)?.text = user?.job
        findViewById<TextView>(R.id.company)?.text = user?.company

        val btnSubmit = findViewById<Button>(R.id.button)
        btnSubmit.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
        }
    }
}