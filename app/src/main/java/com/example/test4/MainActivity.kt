package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //hola

        //como estás?

        //yo muy bien y tú?

        //bien, siendo un maldito helicoptero de ocho helices con motor triple velocidad

        //Cuantos helicopteros apache existen en el mundo?

        //A ver, en Rusia hay alrededor de 8

        val helicopterosR = 8

        //En estados unidos hay alrededor de 30

        val helicopterosEU = 30

        //Y en Colombia hay como 1 no mas, pobres hps

        val helicopterosC = 1

        //Entonces en total habrian como unos...

        val helicopteros = helicopterosC + helicopterosEU + helicopterosR

        println("En total, en todo el mundo hay unos " + helicopteros + " helicopteros en total.")

        val helicopterosEur = helicopterosEU + helicopterosR

        println("Y si solo contamos a estados unidos y rusia serían " + helicopterosEur + " helicopteros en total.")
    }
}