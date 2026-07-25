package com.fcesar.bartogaleno.ui

import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.content.Intent
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.fcesar.bartogaleno.R
import com.fcesar.bartogaleno.data.QuestionRepository

class QuestionActivity : AppCompatActivity() {

    private lateinit var txtPergunta: TextView
    private lateinit var radioGroup: RadioGroup
    private lateinit var rb1: RadioButton
    private lateinit var rb2: RadioButton
    private lateinit var rb3: RadioButton

    private lateinit var rb4: RadioButton
    private lateinit var btnProxima: Button

    private var indice = 0
    private val perguntas = QuestionRepository.questions
    private val respostas = mutableListOf<Int>()

    private lateinit var txtProgresso: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        txtPergunta = findViewById(R.id.txtPergunta)
        txtProgresso = findViewById(R.id.txtProgresso)

        radioGroup = findViewById(R.id.radioGroup)
        rb1 = findViewById(R.id.rb1)
        rb2 = findViewById(R.id.rb2)
        rb3 = findViewById(R.id.rb3)
        rb4 = findViewById(R.id.rb4)
        btnProxima = findViewById(R.id.btnProxima)

        mostrarPergunta()

        btnProxima.setOnClickListener {

            if (radioGroup.checkedRadioButtonId == -1) {
                Toast.makeText(
                    this,
                    "Selecione uma resposta.",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val respostaSelecionada = radioGroup.indexOfChild(
                findViewById(radioGroup.checkedRadioButtonId)
            )

            respostas.add(respostaSelecionada)

            indice++

            if (indice < perguntas.size) {
                mostrarPergunta()
            } else {

                val intent = Intent(this, ResultActivity::class.java)

                intent.putIntegerArrayListExtra(
                    "RESPOSTAS",
                    ArrayList(respostas)
                )

                startActivity(intent)

                finish()
            }
        }
    }

    private fun mostrarPergunta() {

        val pergunta = perguntas[indice]

        txtProgresso.text = "Situação ${indice + 1} de ${perguntas.size}"

        txtPergunta.text = pergunta.texto

        rb1.text = pergunta.opcoes[0]
        rb2.text = pergunta.opcoes[1]
        rb3.text = pergunta.opcoes[2]
        rb4.text = pergunta.opcoes[3]

        radioGroup.clearCheck()
    }
}