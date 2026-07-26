package com.fcesar.bartogaleno.util

import android.os.Handler
import android.os.Looper
import android.widget.TextView

object TypeWriter {

    private val handler = Handler(Looper.getMainLooper())

    fun escrever(
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
}