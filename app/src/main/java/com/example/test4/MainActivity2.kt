package com.example.test4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        interfaz()
        Aprendizaje()

    }

    private fun Aprendizaje(){


        //Prueba Suma: Double, Float & Int
        val myFloat = 1.5f
        val myDouble = 1.25
        val myInt = 1

        println(myFloat + myDouble + myInt)

        //----------------------------
        // 

    }

    private fun interfaz(){

        // SE CREAN VARIABLES CON LAS INTERFACES GRÁFICAS
        val emailEText = findViewById<EditText>(R.id.emailcito) //SE REFERENCIA EL EMAIL
        val contraEText = findViewById<EditText>(R.id.editTextTextPassword2)
        val botoncito = findViewById<Button>(R.id.botonInicioS) //SE REFERENCIA EL BOTON INICIO
        val permutarBot = findViewById<Button>(R.id.toggle1)

        //SE CREAN LAS VARIABLES DE PRUEBA DE COMPROBACIÓN
        val cuenta1 = "admin"
        val contra1: String? = "1234"

        botoncito.setOnClickListener(){

            val emailString: String? = emailEText.text.toString() //SE OBTIENE EL TECTO EN STRING DE EL CAMPO DE EMAIL
            val contraString: String? = contraEText.text.toString() //SE OBTIENE LA CONTRASEÑA

            println(emailString)
            println(contraString)

            println(emailString + contraString)

            if (emailString == cuenta1 && contraString == contra1) {   //SE COMPRUEBA LA IGUALDAD.

                println("¡Inicio Exitoso!")

                val interfazLoged = Intent(this, PantallaLoggedAndres::class.java)
                startActivity(interfazLoged)

            } else {

                println("Error en el inicio de sesión...")

            }
        }

        permutarBot.setOnClickListener(){

            val intento1 = Intent(this, SegundaPantalla::class.java)
            startActivity(intento1)

        }

    }

}