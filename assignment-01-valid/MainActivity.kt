package com.example.checking1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etUser : EditText =findViewById(R.id.botz_user)
        val etPass:EditText=findViewById(R.id.botz_password)
        val eEmail:EditText = findViewById(R.id.botz_email)
        val btDisplay: Button = findViewById(R.id.botz_button)
        var errorMessage = ""
        btDisplay.setOnClickListener{
            val username = etUser.text.toString()
            val password = etPass.text.toString()
            val Email = eEmail.text.toString()
            if(username.isNotEmpty() && username.length >= 3 && username.all { it.isLetter() || it.isWhitespace() }){
                errorMessage="Invalid UserName"
            }
            if(password.length < 8 || !password.any { it.isUpperCase() } || !password.any { it.isLowerCase() } || !password.any { it.isDigit() } || !password.any { "!@#\$%^&*()-_+=<>?/".contains(it) }){
                errorMessage="Invalid Password"
            }
            if(!Email.any { "!@#\$%^&*()-_+=<>?/".contains(it) }){
                errorMessage="Invalid Email"
            }

            val alertDialog = AlertDialog.Builder(this)
                .setTitle("Validation")
                .setMessage(errorMessage)
                .setPositiveButton("Ok"){dialog, which->
                    Toast.makeText(this,"you clicked the message",Toast.LENGTH_LONG).show()


                }
                .setNegativeButton("Cancel"){dialog, which->
                    Toast.makeText(this,"you clicked cancel",Toast.LENGTH_LONG).show()
                }
            alertDialog.show()
        }

    }


}