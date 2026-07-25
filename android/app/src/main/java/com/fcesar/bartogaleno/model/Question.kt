package com.fcesar.bartogaleno.model

data class Question(
    val texto: String,
    val opcoes: List<String>,
    val respostaEsperada: Int,
    val comportamento: Behavior,
    val explicacao: String
)