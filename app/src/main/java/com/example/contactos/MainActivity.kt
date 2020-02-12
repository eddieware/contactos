package com.example.contactos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var contacto :Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Boton contacto1
        imageBtn1.setOnClickListener{
            //setContentView(R.layout.secondlayout) inecesario por la inclusion en el manifesto
            val intent = Intent(this,SecondActivity::class.java)
            val name = "Rosa Perez"
            val ocupacion = "Secretaria"
            val trabaja = "SHCP"
            val domicilio = "Ocampo No. 234"
            val ciudad = "Celaya, Gto."
            val correo = "rosa@gmail.com"
            val tel = "4611238907"

            intent.putExtra("Name",name)
            intent.putExtra("Ocupacion",ocupacion)
            intent.putExtra("Trabaja",trabaja)
            intent.putExtra("Domicilio",domicilio)
            intent.putExtra("Ciudad", ciudad)
            intent.putExtra("Correo",correo)
            intent.putExtra("Tel",tel)


            startActivity(intent)
            finish()


        }

        //Boton contacto2
        imageBtn2.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            val name = "Julian Arreguin"
            val ocupacion = "Programador"
            val trabaja = "Apple"
            val domicilio = "Ocampo No. 235"
            val ciudad = "Irapuato, Gto."
            val correo = "julian@gmail.com"
            val tel = "4611238908"

            intent.putExtra("Name",name)
            intent.putExtra("Ocupacion",ocupacion)
            intent.putExtra("Trabaja",trabaja)
            intent.putExtra("Domicilio",domicilio)
            intent.putExtra("Ciudad", ciudad)
            intent.putExtra("Correo",correo)
            intent.putExtra("Tel",tel)

            startActivity(intent)
            finish()

        }
        //Boton3
        imageBtn3.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            val name = "Susy Ramirez"
            val ocupacion = "Diseñadora"
            val trabaja = "Lacoste"
            val domicilio = "Ocampo No. 236"
            val ciudad = "Salamanca, Gto."
            val correo = "susy@gmail.com"
            val tel = "4611238909"

            intent.putExtra("Name",name)
            intent.putExtra("Ocupacion",ocupacion)
            intent.putExtra("Trabaja",trabaja)
            intent.putExtra("Domicilio",domicilio)
            intent.putExtra("Ciudad", ciudad)
            intent.putExtra("Correo",correo)
            intent.putExtra("Tel",tel)

            startActivity(intent)
            finish()

        }
    }


}
