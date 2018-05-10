package com.example.narongritsu.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {


    val user = "1234"
    val pass = "5678"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textUser:EditText = findViewById<EditText>(R.id.username)
        username.text.toString()
        password.text.toString()
        button_login.setOnClickListener (this)
        for (i in 0..4){

        }
    }

    private fun checkLogin() : Boolean {
        if (user == username.text.toString() && pass == password.text.toString()){
            return true
            var intent = Intent(this,Main2Activity::class.java)
        }
        return false
    }
    override fun onClick(v: View?) {
        when(v){
            button_login->{
                var chk = checkLogin()
                Toast.makeText(this,""+chk,Toast.LENGTH_LONG).show() }
        }
    }
}
