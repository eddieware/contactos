package com.example.contactos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageBtn1.setOnClickListener{
            //setContentView(R.layout.secondlayout)
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)

        }
    }


}
