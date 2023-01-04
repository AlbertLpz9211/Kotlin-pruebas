package com.movil.myapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //se le agrega una funcion para saludar
        val bSaludar = findViewById<Button>(R.id.bSaludar)
        bSaludar.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Hola! developer", Toast.LENGTH_LONG).show()
        })
    }

    //funcion para validar que el campo de texto tenga algun contenido
    fun validarDato():Boolean{
        val etNombre=findViewById<EditText>(R.id.etNombre)
        val nombreUsuario = etNombre.text
        if(nombreUsuario.isNullOrEmpty()){
            return false
        }
        return true
    }

}