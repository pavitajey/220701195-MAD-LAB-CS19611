package com.example.bmicalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text=findViewById<TextView>(R.id.textView)
        val input1 = findViewById<EditText>(R.id.editTextText)
        val input2 = findViewById<EditText>(R.id.editTextText2)
        val button=findViewById<Button>(R.id.button)
        val result=findViewById<TextView>(R.id.textView2)

        button.setOnClickListener{
            val weight =input1.text.toString().toDouble()
            val height=input2.text.toString().toDouble()
            val metres=height/100
            val ans =weight/(metres*metres)
            val round=String.format("%.1f", ans).toDouble()

            result.text=" BMI is $round kg/m^2"
        }

    }
}
