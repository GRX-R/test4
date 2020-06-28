package com.example.test4

import android.inputmethodservice.ExtractEditText
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // SE CRAN VARIABLES CON LAS INTERFACES GRÁFICAS
        val emailEText = findViewById<EditText>(R.id.emailcito) //SE REFERENCIA EL EMAIL
        val contraEText = findViewById<EditText>(R.id.editTextTextPassword2)
        val botoncito = findViewById<Button>(R.id.botonInicioS) //SE REFERENCIA EL BOTON INICIO

        //SE CREAN LAS VARIABLES DE PRUEBA DE COMPROBACIÓN
        val cuenta1 = "admin"
        val contra1 = "1234"

        botoncito.setOnClickListener(){

            val emailString: String? = emailEText.text.toString() //SE OBTIENE EL TECTO EN STRING DE EL CAMPO DE EMAIL
            val contraString: String? = contraEText.text.toString() //SE OBTIENE LA CONTRASEÑA

            println(emailString)
            println(contraString)
            if (emailString == cuenta1 && contraString == contra1) {   //SE COMPRUEBA LA IGUALDAD.

                println("¡Inicio Exitoso!")

            } else {

                println("Error en el inicio de sesión...")

            }

        }

    }
}