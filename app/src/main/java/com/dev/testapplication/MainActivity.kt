package com.dev.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextView = findViewById<EditText>(R.id.username)
        val submitButton = findViewById<Button>(R.id.submit)


        submitButton.setOnClickListener {
            val result = editTextView.text.toString()
            Log.d("tag", "did it get here")
            Log.d("tag", "result is $result")

            val activityIntent = Intent(this, Activity2::class.java)
            startActivity(activityIntent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }
}