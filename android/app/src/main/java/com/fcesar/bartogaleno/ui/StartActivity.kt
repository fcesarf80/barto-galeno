package com.fcesar.bartogaleno.ui

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.fcesar.bartogaleno.util.TypeWriter
import androidx.appcompat.app.AppCompatActivity
import com.fcesar.bartogaleno.R
import com.fcesar.bartogaleno.animation.BartoAnimator

class StartActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val edtNome = findViewById<EditText>(R.id.edtNome)
        val btnIniciar = findViewById<Button>(R.id.btnIniciar)
        val txtFalaBarto = findViewById<TextView>(R.id.txtFalaBarto)
        val imgBarto = findViewById<ImageView>(R.id.imgBarto)

        val animator = BartoAnimator(imgBarto)

        btnIniciar.setOnClickListener {

            val nome = edtNome.text.toString().trim()

            if (nome.isEmpty()) {
                edtNome.error = "Informe seu nome"
                edtNome.requestFocus()
                return@setOnClickListener
            }

            txtFalaBarto.visibility = View.VISIBLE

            animator.iniciar()

            TypeWriter.escrever(
                txtFalaBarto,
                """
                Bem-vindo, $nome!

                Eu sou o Bartô Galeno.

                Vou acompanhá-lo durante esta reflexão.

                Vamos começar!
                """.trimIndent()
            ) {
                animator.parar()
            }

            val mediaPlayer = MediaPlayer.create(this, R.raw.intro_barto)

            mediaPlayer.start()

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