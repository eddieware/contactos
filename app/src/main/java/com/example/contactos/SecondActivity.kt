package com.example.contactos

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.secondlayout.*

class SecondActivity :AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondlayout)
        var email: String = ""
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






        bhacerllamada.setOnClickListener(View.OnClickListener {

            //LLAMAR A ROSA
            if (name == "Rosa Perez")
            {
            val Uri = Uri.parse( "tel:4611238907")
            val it = Intent(Intent.ACTION_DIAL, Uri)

            if (intent.resolveActivity(packageManager) != null)
            {
                startActivity(it)
                // Si es diferente de vacio lanza el intent

            }
            }

            //LLAMAR A JULIAN
            if (name == "Julian Arreguin")
            {
                val Uri = Uri.parse( "tel:4611238908")
                val it = Intent(Intent.ACTION_DIAL, Uri)

                if (intent.resolveActivity(packageManager) != null)
                {
                    startActivity(it)
                    // Si es diferente de vacio lanza el intent

                }
            }
            //LLAMAR A SUSY

            if (name == "Susy Ramirez")
            {
                val Uri = Uri.parse( "tel:4611238909")
                val it = Intent(Intent.ACTION_DIAL, Uri)

                if (intent.resolveActivity(packageManager) != null)
                {
                    startActivity(it)
                    // Si es diferente de vacio lanza el intent

                }
            }







        })


        btnEmail.setOnClickListener {
            val intEmail = Intent(Intent.ACTION_SENDTO).apply {
                if (name == "Rosa Perez") {
                    data = Uri.parse("mailto:".plus("rosa@gmail.com"))
                }else if (name == "Julian Arreguin"){
                    data = Uri.parse("mailto:".plus("julian@gmail.com"))
                }else{
                    data = Uri.parse("mailto:".plus("susy@gmail.com"))

                }
                putExtra(Intent.EXTRA_SUBJECT,"Email topic")
                putExtra(Intent.EXTRA_TEXT,"some body here")

            }
            if( intent.resolveActivity(packageManager) != null )
                startActivity(intEmail)

        }






    }
}