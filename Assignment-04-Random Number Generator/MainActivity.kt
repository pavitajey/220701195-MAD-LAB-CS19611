package com.example.randomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1=findViewById<EditText>(R.id.editTextText)
        val input2=findViewById<EditText>(R.id.editTextText2)
        val button=findViewById<Button>(R.id.button)
        val res=findViewById<TextView>(R.id.textView2)

        button.setOnClickListener{
            val max=input1.text.toString().toInt()
            val min=input2.text.toString().toInt()
            val randomNumber = Random.nextInt(min, max + 1)

            res.text="Random Number: $randomNumber"
        }

    }
}
