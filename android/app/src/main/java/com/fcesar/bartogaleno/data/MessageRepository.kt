package com.fcesar.bartogaleno.data

import com.fcesar.bartogaleno.model.Behavior

object MessageRepository {

    fun getMessage(behavior: Behavior): String {

        return when (behavior) {

            Behavior.COMUNICACAO ->
                """
                O comportamento que mais se destacou foi a Comunicação.

                Uma comunicação clara, objetiva e respeitosa facilita o trabalho em grupo e reduz conflitos.

                Este questionário tem finalidade educativa e incentiva a reflexão sobre comportamentos em ambientes de trabalho. Não se trata de uma avaliação psicológica ou de personalidade.
                """.trimIndent()

            Behavior.RESPEITO ->
                """
                O comportamento que mais se destacou foi o Respeito.

                Ouvir os colegas, valorizar opiniões diferentes e agir com consideração fortalece a convivência profissional.

                Este questionário tem finalidade educativa e incentiva a reflexão sobre comportamentos em ambientes de trabalho. Não se trata de uma avaliação psicológica ou de personalidade.
                """.trimIndent()

            Behavior.RESPONSABILIDADE ->
                """
                O comportamento que mais se destacou foi a Responsabilidade.

                Assumir compromissos e reconhecer os próprios erros contribui para o crescimento profissional.

                Este questionário tem finalidade educativa e incentiva a reflexão sobre comportamentos em ambientes de trabalho. Não se trata de uma avaliação psicológica ou de personalidade.
                """.trimIndent()

            Behavior.PARTICIPACAO ->
                """
                O comportamento que mais se destacou foi a Participação.

                Participar das discussões e colaborar com ideias ajuda o grupo a alcançar melhores resultados.

                Este questionário tem finalidade educativa e incentiva a reflexão sobre comportamentos em ambientes de trabalho. Não se trata de uma avaliação psicológica ou de personalidade.
                """.trimIndent()

            Behavior.ETICA ->
                """
                O comportamento que mais se destacou foi a Ética.

                Agir com honestidade e integridade fortalece a confiança entre as pessoas.

                Este questionário tem finalidade educativa e incentiva a reflexão sobre comportamentos em ambientes de trabalho. Não se trata de uma avaliação psicológica ou de personalidade.
                """.trimIndent()

            Behavior.INTELIGENCIA_RELACIONAL ->
                """
                O comportamento que mais se destacou foi a Inteligência Relacional.

                Desenvolver boas relações interpessoais favorece a cooperação e um ambiente de trabalho saudável.

                Este questionário tem finalidade educativa e incentiva a reflexão sobre comportamentos em ambientes de trabalho. Não se trata de uma avaliação psicológica ou de personalidade.
                """.trimIndent()
        }
    }
}