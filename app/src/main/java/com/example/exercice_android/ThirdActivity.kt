package com.example.exercice_android

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val action = intent.action
        Log.i("ActionActivity", "action: $action")
        val isUserViewer = intent.hasCategory("user")
        val extras: Bundle? = intent.extras
        val name = extras?.getString("name")
        val job = extras?.getString("job")
        val company = extras?.getString("company")

        Log.i("ActionActivity", "extras: $extras")

        val nameTextView = findViewById<TextView>(R.id.name)
        val jobTextView = findViewById<TextView>(R.id.job)
        val companyTextView = findViewById<TextView>(R.id.company)

        nameTextView?.text = name
        jobTextView?.text = job
        companyTextView?.text = company
    }
}