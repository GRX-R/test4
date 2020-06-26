package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        primerFuncion()

    }

    private fun primerFuncion(){

        // Empieza una fuesta...
        //Es una fiesta de mascotas.
        //Un sapo hp le da por llevar 126 perros...

        val perros = 126

        //Ahora, resulta que la tia carmensa se trajo a sus 48 gatos, mucha sapaperra

        val gatos = 48

        //Y, a tu primo con down, le dio por trar sus camaleones. 3 camaleones.

        val camaleones = 3

        //¿Cuántos animales hay en la fiesta?

        val animales = perros + gatos + camaleones

        //¿Cuántos de estos animales son mamíferos?

        val mamiferos = perros + gatos

        //Mostrar en pantalla

        println("En total, tu extraña familia y amigos, trajeron... " + animales + " animales, y hay " + mamiferos + " mamíferos.")

        //26/6/2020

    }
}