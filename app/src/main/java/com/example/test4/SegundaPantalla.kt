package com.example.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SegundaPantalla : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)

        permutacionMain2() //Se llama a la función de cambio de pantallas.
        interfaz()
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

    private fun interfaz(){

        val emailEditText = findViewById<EditText>(R.id.emailInput)
        val contraEditText = findViewById<EditText>(R.id.editTextTextPassword)
        val registerA = findViewById<Button>(R.id.registroBot)
        val inicioSesionA = findViewById<Button>(R.id.inicioBot)

        var usuario: String? = null
        var contra: String? = null

        registerA.setOnClickListener(){

            val emailText = emailEditText.text.toString()
            val contraText = contraEditText.text.toString()

            usuario = emailText
            contra = contraText

        }

        inicioSesionA.setOnClickListener(){

            val emailTextI = emailEditText.text.toString()
            val contraTextI = contraEditText.text.toString()

            if (emailTextI == usuario && contraTextI == contra){

                println("Log-in exitoso!")

            } else {

                println("Error de log-in!")

            }

        }

    }
}