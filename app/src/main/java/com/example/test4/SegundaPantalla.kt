package com.example.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaPantalla : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)

        permutacionMain2() //Se llama a la función de cambio de pantallas.
    }


    // Función para el cambio de pantallas.
    private fun permutacionMain2(){

        val botonToggle = findViewById<Button>(R.id.toggle2)


        botonToggle.setOnClickListener(){

            //Se busca el Activity (Pantalla a cargar)
            val intento = Intent(this, MainActivity2::class.java)
            startActivity(intento)

        }

    }
}