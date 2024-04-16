package com.example.exercice_android

import android.content.Intent
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

        val extras: Bundle? = intent.extras
        val name = extras?.getString("name")
        val job = extras?.getString("job")
        val company = extras?.getString("company")

        findViewById<TextView>(R.id.name)?.text = name
        findViewById<TextView>(R.id.job)?.text = job
        findViewById<TextView>(R.id.company)?.text = company

        val btnSubmit = findViewById<Button>(R.id.button)
        btnSubmit.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.action = Intent.ACTION_VIEW
            intent.addCategory("user")
            intent.putExtra("name", name)
            intent.putExtra("job", job)
            intent.putExtra("company", company)
            startActivity(intent)
        }
    }
}