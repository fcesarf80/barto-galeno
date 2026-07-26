package com.fcesar.bartogaleno.animation

import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.fcesar.bartogaleno.R
import com.fcesar.bartogaleno.animation.BartoAnimator

class BartoAnimator(
    private val imageView: ImageView
) {

    private val handler = Handler(Looper.getMainLooper())

    private var runnableFala: Runnable? = null

    private var bocaAberta = false

    fun iniciar() {

        if (runnableFala != null) {
            return
        }

        imageView.setImageResource(R.drawable.galo_fala_01)

        runnableFala = object : Runnable {

            override fun run() {

                imageView.setImageResource(
                    if (bocaAberta)
                        R.drawable.galo_fala_01
                    else
                        R.drawable.galo_fala_02
                )

                bocaAberta = !bocaAberta

                handler.postDelayed(this, 180)
            }
        }

        handler.post(runnableFala!!)
    }

    fun parar() {

        runnableFala?.let {
            handler.removeCallbacks(it)
        }

        runnableFala = null
        bocaAberta = false

        imageView.setImageResource(R.drawable.galo_espera)
    }
}