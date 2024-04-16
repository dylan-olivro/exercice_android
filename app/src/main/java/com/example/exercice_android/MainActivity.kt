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

            val intent = Intent(this, SecondActivity::class.java)
            intent.action = Intent.ACTION_VIEW
            intent.addCategory("user")
            intent.putExtra("name", fullName)
            intent.putExtra("job", fullJob)
            intent.putExtra("company", fullCompany)
            startActivity(intent)
        }
    }

    fun submitbuttonHandler(view: View?) {
        //Decide what happens when the user clicks the submit button
        val nameEditText = findViewById<EditText>(R.id.names)
        val fullName = nameEditText.text.toString()

        val jobEditText = findViewById<EditText>(R.id.job)
        val fullJob = jobEditText.text.toString()

        val companyEditText = findViewById<EditText>(R.id.company)
        val fullCompany = companyEditText.text.toString()

        Log.i(TAG, fullName)
        Log.i(TAG, fullJob)
        Log.i(TAG, fullCompany)
    }
}