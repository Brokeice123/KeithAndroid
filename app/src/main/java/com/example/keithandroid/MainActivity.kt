package com.example.keithandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var email:EditText
    private lateinit var password:EditText
    private lateinit var loginBtn:Button
    private lateinit var regBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.login_email)
        password = findViewById(R.id.login_password)
        loginBtn = findViewById(R.id.login_loginbtn)
        regBtn = findViewById(R.id.login_registerbtn)

        loginBtn.setOnClickListener {
            Toast.makeText(this, "I just got Clicked!!", Toast.LENGTH_SHORT).show()
        }
    }
}