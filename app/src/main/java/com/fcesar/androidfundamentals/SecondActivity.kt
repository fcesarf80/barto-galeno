package com.fcesar.androidfundamentals

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txtNumero = findViewById<TextView>(R.id.txtNumero)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        val painelInfo2 = findViewById<LinearLayout>(R.id.painelInfo2)
        val btnOk2 = findViewById<Button>(R.id.btnOk2)

        btnOk2.setOnClickListener {
            painelInfo2.visibility = View.GONE
        }

        val numero = intent.getIntExtra("numero", 0)
        val resultado = numero * 2

        txtNumero.text = "Número recebido: $numero"

        val lista = listOf(
            Numero("Número recebido: $numero"),
            Numero("Dobro: $resultado"),
            Numero("Processamento concluído")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = NumeroAdapter(lista)

        btnVoltar.setOnClickListener {

            val intent = Intent()
            intent.putExtra("resultado", resultado)

            setResult(RESULT_OK, intent)
            finish()
        }
    }
}