package com.fcesar.bartogaleno.ui

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.fcesar.bartogaleno.R

class StartActivity : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())

    private var animacaoAtiva = false
    private fun escreverTexto(
        textView: TextView,
        mensagem: String,
        velocidade: Long = 40,
        aoTerminar: (() -> Unit)? = null
    ) {

        textView.text = ""

        mensagem.forEachIndexed { index, _ ->

            handler.postDelayed({

                textView.text = mensagem.substring(0, index + 1)

                if (index == mensagem.lastIndex) {
                    aoTerminar?.invoke()
                }

            }, velocidade * index)
        }
    }

    private fun animarFala(
        imageView: ImageView
    ) {

        animacaoAtiva = true

        imageView.setImageResource(R.drawable.galo_fala_01)

        val runnable = object : Runnable {

            private var bocaAberta = false

            override fun run() {

                imageView.setImageResource(
                    if (bocaAberta)
                        R.drawable.galo_fala_01
                    else
                        R.drawable.galo_fala_02
                )

                bocaAberta = !bocaAberta

                if (animacaoAtiva) {
                    handler.postDelayed(this, 180)
                } else {
                    imageView.setImageResource(R.drawable.galo_espera)
                }
            }
        }

        handler.post(runnable)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val edtNome = findViewById<EditText>(R.id.edtNome)
        val btnIniciar = findViewById<Button>(R.id.btnIniciar)
        val txtFalaBarto = findViewById<TextView>(R.id.txtFalaBarto)
        val imgBarto = findViewById<ImageView>(R.id.imgBarto)

        btnIniciar.setOnClickListener {

            val nome = edtNome.text.toString().trim()

            if (nome.isEmpty()) {
                edtNome.error = "Informe seu nome"
                edtNome.requestFocus()
                return@setOnClickListener
            }

            txtFalaBarto.visibility = View.VISIBLE

            escreverTexto(
                txtFalaBarto,
                """
                Bem-vindo, $nome!
            
                Eu sou o Bartô Galeno.
            
                Vou acompanhá-lo durante esta reflexão.
            
                Vamos começar!
                """.trimIndent()
            ) {
                animacaoAtiva = false
            }

            val mediaPlayer = MediaPlayer.create(this, R.raw.intro_barto)

            mediaPlayer.start()

            animarFala(imgBarto)

            mediaPlayer.setOnCompletionListener {

                it.release()

                val intent = Intent(this, QuestionActivity::class.java)
                intent.putExtra("NOME", nome)

                startActivity(intent)

                finish()
            }
        }
    }
}