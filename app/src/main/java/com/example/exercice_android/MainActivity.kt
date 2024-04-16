package com.example.exercice_android

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.ContentValues.TAG
import android.content.Intent
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.button)
        btnSubmit.setOnClickListener {
            val nameEditText = findViewById<EditText>(R.id.names)
            val fullName = nameEditText.text.toString()

            val jobEditText = findViewById<EditText>(R.id.job)
            val fullJob = jobEditText.text.toString()

            val companyEditText = findViewById<EditText>(R.id.company)
            val fullCompany = companyEditText.text.toString()

            if(fullName.isEmpty() || fullJob.isEmpty() || fullCompany.isEmpty()) {
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                intent.action = Intent.ACTION_VIEW
                intent.addCategory("user")
                intent.putExtra("name", fullName)
                intent.putExtra("job", fullJob)
                intent.putExtra("company", fullCompany)
                startActivity(intent)
            }
        }
    }
}