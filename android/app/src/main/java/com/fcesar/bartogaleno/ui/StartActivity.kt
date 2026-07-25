package com.fcesar.bartogaleno.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.fcesar.bartogaleno.ui.QuestionActivity
import com.fcesar.bartogaleno.R

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val edtNome = findViewById<EditText>(R.id.edtNome)
        val btnIniciar = findViewById<Button>(R.id.btnIniciar)

        btnIniciar.setOnClickListener {

            val nome = edtNome.text.toString().trim()

            val intent = Intent(this, QuestionActivity::class.java)
            intent.putExtra("NOME", nome)

            startActivity(intent)
        }
    }
}