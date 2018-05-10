package com.example.narongritsu.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val user = "1234"
    val pass = "5678"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textUser:EditText = findViewById<EditText>(R.id.username)
        username.text.toString()
        password.text.toString()
        button_login.setOnClickListener {
            var chk = checkLogin()
            Toast.makeText(this,""+chk,Toast.LENGTH_LONG).show()
        }
    }

    private fun checkLogin() : Boolean {
        if (user == username.text.toString() && pass == password.text.toString()){
            return true
        }
        return false
    }

}
