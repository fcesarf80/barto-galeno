package com.fcesar.bartogaleno.util

import com.fcesar.bartogaleno.data.QuestionRepository
import com.fcesar.bartogaleno.model.Behavior

class QuestionEvaluator {

    fun avaliar(respostas: List<Int>): Behavior? {

        val perguntas = QuestionRepository.questions

        val pontuacao = mutableMapOf<Behavior, Int>()

        for (i in respostas.indices) {

            val pergunta = perguntas[i]

            if (respostas[i] == pergunta.respostaEsperada) {

                val comportamento = pergunta.comportamento

                pontuacao[comportamento] =
                    (pontuacao[comportamento] ?: 0) + 1
            }
        }

        if (pontuacao.isEmpty()) {
            return null
        }

        return pontuacao.maxByOrNull { it.value }?.key
    }
}