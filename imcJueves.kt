package com.example.cursomiercoles
// programa que nos diga si podemos votar
fun main() {
    val edad = 32
    if (edad < 12){
        println(" no puedes consumir")
    }
    if (edad == 13){
        println("no compres alcohol")
    }
    else if (edad == 32){
        println(" eres un borracho")
    }
    else if (edad >=18 && edad < 40){
        println(" mejor ponte a trabajar")
    }

    else{
        println(" eres adulto \n ya toma un fourloco")
        println(" Puedes votar")
    }
}
