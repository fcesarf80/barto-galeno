package com.fcesar.bartogaleno.data

import com.fcesar.bartogaleno.model.Behavior
import com.fcesar.bartogaleno.model.Question

object QuestionRepository {

    val questions = listOf(

        Question(
            texto = "Um membro do grupo diz apenas: \"Não está bom.\", mas não consegue explicar o que precisa ser alterado. Além disso, não entrega a própria parte do trabalho.",

            opcoes = listOf(
                "Feedback construtivo.",
                "Comunicação ineficaz.",
                "Liderança colaborativa.",
                "Delegação eficiente."
            ),

            respostaEsperada = 1,
            comportamento = Behavior.COMUNICACAO,
            explicacao = "Quando o feedback não apresenta critérios claros, ocorre retrabalho e aumentam os conflitos no grupo."
        ),

        Question(
            texto = "Um membro do grupo interrompe constantemente as outras pessoas durante as conversas.",

            opcoes = listOf(
                "Escuta ativa.",
                "Falta de empatia e respeito.",
                "Comunicação assertiva.",
                "Proatividade individual."
            ),

            respostaEsperada = 1,
            comportamento = Behavior.RESPEITO,
            explicacao = "Interromper outras pessoas dificulta a comunicação e reduz a participação do grupo."
        ),

        Question(
            texto = "Um membro do grupo critica em público e elogia em particular, ou faz o contrário.",

            opcoes = listOf(
                "Gestão pelo medo.",
                "Comunicação transparente.",
                "Falta de inteligência emocional.",
                "Exposição desnecessária e assimetria."
            ),

            respostaEsperada = 3,
            comportamento = Behavior.INTELIGENCIA_RELACIONAL,
            explicacao = "Expor alguém diante do grupo enfraquece a confiança e prejudica as relações profissionais."
        ),

        Question(
            texto = "Um membro do grupo nunca assume os próprios erros.",

            opcoes = listOf(
                "Responsabilização mútua.",
                "Transferência de culpa.",
                "Perfeccionismo corporativo.",
                "Resiliência profissional."
            ),

            respostaEsperada = 1,
            comportamento = Behavior.RESPONSABILIDADE,
            explicacao = "Não assumir os próprios erros impede o aprendizado, enfraquece a confiança e sobrecarrega o grupo."
        ),

        Question(
            texto = "Um membro do grupo evita conflitos e nunca expressa sua opinião.",

            opcoes = listOf(
                "Neutralidade estratégica.",
                "Postura colaborativa.",
                "Omissão e comportamento passivo.",
                "Respeito à hierarquia."
            ),

            respostaEsperada = 2,
            comportamento = Behavior.PARTICIPACAO,
            explicacao = "Permanecer em silêncio diante de problemas impede que novas ideias e soluções sejam compartilhadas."
        ),

        Question(
            texto = "Durante uma apresentação, um membro do grupo prejudica um colega para desviar a atenção das próprias dificuldades.",

            opcoes = listOf(
                "Comportamento tóxico e autoproteção prejudicial.",
                "Competitividade saudável.",
                "Senso de urgência.",
                "Feedback de desempenho em tempo real."
            ),

            respostaEsperada = 0,
            comportamento = Behavior.ETICA,
            explicacao = "Prejudicar outra pessoa para obter vantagem enfraquece a confiança e compromete o trabalho do grupo."
        )

    )

}