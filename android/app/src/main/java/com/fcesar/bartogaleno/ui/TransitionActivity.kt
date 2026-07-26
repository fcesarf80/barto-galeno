package com.fcesar.bartogaleno.ui

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.fcesar.bartogaleno.R
import com.fcesar.bartogaleno.animation.BartoAnimator
import com.fcesar.bartogaleno.util.TypeWriter

class TransitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition)

        val txtFala = findViewById<TextView>(R.id.txtFalaBarto)
        val imgBarto = findViewById<ImageView>(R.id.imgBarto)

        val animator = BartoAnimator(imgBarto)

        val respostas = intent.getIntegerArrayListExtra("RESPOSTAS")

        animator.iniciar()

        TypeWriter.escrever(
            txtFala,
            """
Muito bem!

Agora vou analisar as suas respostas.

Em seguida apresentarei uma reflexão baseada nas escolhas que você fez.
            """.trimIndent()
        ) {
            animator.parar()
        }

        val mediaPlayer = MediaPlayer.create(this, R.raw.intro_barto)

        mediaPlayer.start()

        mediaPlayer.setOnCompletionListener {

            it.release()

            val intent = Intent(this, ResultActivity::class.java)

            intent.putIntegerArrayListExtra(
                "RESPOSTAS",
                respostas ?: arrayListOf()
            )

            startActivity(intent)

            finish()
        }
    }
}