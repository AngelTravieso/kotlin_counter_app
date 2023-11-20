package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val resulText = findViewById<TextView>(R.id.result_text)

        btn.setOnClickListener() {
            // Set text to the counter
            resulText.setText(""+increaseCounter())
        }

    }

    fun increaseCounter(): Int {
        counter++
        return counter
    }

}