package com.example.cursomiercoles

fun main(parametro: Array<String>) {
    println("Ingrese su dia:")
    val diaSemana = readln().toInt()

    when (diaSemana) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        else -> println("Fin de Semana")
    }
    if (diaSemana == 4) {
        println("Dia de hooters, dos por uno, en chelas")
    }
}
