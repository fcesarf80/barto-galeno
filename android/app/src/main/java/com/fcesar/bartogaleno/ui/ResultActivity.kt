package com.fcesar.bartogaleno.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.fcesar.bartogaleno.R
import com.fcesar.bartogaleno.data.MessageRepository
import com.fcesar.bartogaleno.util.QuestionEvaluator

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_result)

        val respostas =
            intent.getIntegerArrayListExtra("RESPOSTAS") ?: arrayListOf()

        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnFinalizar = findViewById<Button>(R.id.btnFinalizar)

        val evaluator = QuestionEvaluator()
        val comportamento = evaluator.avaliar(respostas)

        txtResultado.text = MessageRepository.getMessage(comportamento)

        btnFinalizar.setOnClickListener {
            finishAffinity()
        }

        val btnRefazer = findViewById<Button>(R.id.btnRefazer)

        btnRefazer.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or
                    Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }


}