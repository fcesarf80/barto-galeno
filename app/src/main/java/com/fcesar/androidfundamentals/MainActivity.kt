package com.fcesar.androidfundamentals

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val secondActivityLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->

            if (result.resultCode == RESULT_OK) {

                val numeroDobrado =
                    result.data?.getIntExtra("resultado", 0) ?: 0

                Toast.makeText(
                    this,
                    "Resultado recebido: $numeroDobrado",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNumero = findViewById<EditText>(R.id.edtNumero)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {

            val numero = edtNumero.text.toString().toIntOrNull() ?: 0

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("numero", numero)

            secondActivityLauncher.launch(intent)
        }
    }
}