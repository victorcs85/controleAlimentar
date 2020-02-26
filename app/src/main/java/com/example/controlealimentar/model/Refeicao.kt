package com.example.controlealimentar.model

data class Refeicao(
    val nome: String,
    val horario: String? = null,
    val caloria: Int = 0,
    val proteina: Int = 0,
    val carboidrato: Int = 0,
    val gordura: Int = 0
)