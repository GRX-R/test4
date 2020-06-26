package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

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

        //Voy a hacer la multiplicacion de 2 por 64

        val dos = 2
        val seiscuatro = 64
        val multiplicacion = dos * seiscuatro

        println(multiplicacion)

        //Aprendiendo condicionales

        val x = 1
        val y = 2
        val z = 3

        val suma1 = x + y
        val suma2 = x + y + z

        if (suma1 > z){
            println(suma2)
        } else {
            println("No se cumple la condición")
        }

        //Ejercicio de condicionales

        println("Hola, soy andres y quiero invitar a mi crush a cine")
        println("Para eso, tendré que seguir unos pasos.")
        println("Primero, necesito tener crush")
        println("¿Tengo?")

        val tengoCrush = "Si"

        println(tengoCrush)

        if (tengoCrush == "Si"){

            println("Vale, tengo crush, excelente. Puedo seguir con mi plan cual pana miguel")
            println("El siguiente paso es whattsapearle")
            println("¿Tengo el celular en la mano?")

            val celularMano = "Si"

            if (celularMano == "Si"){

                println("Peeeeerfecto, vamos a abrir su chat")
                println("Pero espera... ¿Tengo su numero?")

                val tenerNumero = "Si"

                if (tenerNumero == "Si"){

                    println("Pero que crack, si que lo tengo *bailar*")
                    println("Voy a escribirle entonces, lo cual nos lleva al siguiente paso, invitarla a algun otro lado y ganarnosla")
                    println("¿A donde la debería invitar?")

                    val sitioInvitar = "Parque"

                    if (sitioInvitar == "Parque"){

                        println("Hmmm, al parque, buena idea")
                        println("Chat: Hola crush ¿te gustaría ir al parque conmigo?")
                        println("Que nervios, veamos que me responde")

                        val respuesta = "Claro mi amor"

                        if (respuesta == "Claro mi amor"){

                            println("ME DIJO MI AMOOOOOOOOOOR VAMOSSSSSSS")
                            println("Siguiente paso chavales, ir al parque")

                            val irAlParque = true

                            if (irAlParque == true){

                                println("")

                            }

                        } else {

                            println("Me dejo en visto, F por mi")

                        }

                    } else {

                        println("Nah que mala idea, ya perdi las ganas")

                    }

                } else {

                    println("Chales no lo tengo, se cancela todo")

                }

            } else {

                println("Chales, no tengo celular")

            }

        } else {

            println("Verga, soy una perra solitaria, no tengo crush :( ")

        }


    }
}