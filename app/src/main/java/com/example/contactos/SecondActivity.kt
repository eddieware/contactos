package com.example.contactos

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity :AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondlayout)
        var intent = intent
        val name = intent.getStringExtra("Name")
        val ocupacion = intent.getStringExtra("Ocupacion")
        val trabaja = intent.getStringExtra("Trabaja")
        val domicilio = intent.getStringExtra("Domicilio")
        val ciudad = intent.getStringExtra("Ciudad")
        val correo = intent.getStringExtra("Correo")
        val tel = intent.getStringExtra("Tel")

        val resultTv = findViewById<TextView>(R.id.txtName)
        resultTv.text = name+"\n"+ "Ocupacion: "+ocupacion+"\n"+ "Trabaja en:"+ trabaja+"\n"+
                "Domicilio: "+domicilio+"\n"+"Ciudad: "+ ciudad +"\n"+"Correo: "+correo+"\n"+"Tel: "+tel



    }
}