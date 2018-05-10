package com.example.narongritsu.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

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
        for (i in 0..4){

        }
    }

    private fun checkLogin() : Boolean {
        if (user == username.text.toString() && pass == password.text.toString()){
            return true
        }
        return false
    }

}
