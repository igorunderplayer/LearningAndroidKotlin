package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var inputNome: EditText
    lateinit var botao: Button
    lateinit var toastCheckBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputNome = findViewById(R.id.nameTextInput)
        botao = findViewById(R.id.botaoImprimirNome)
        toastCheckBox = findViewById(R.id.longToastCheckbox)


        botao.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val nome = inputNome.text.toString()
                val toastLength = if (toastCheckBox.isChecked) Toast.LENGTH_LONG else Toast.LENGTH_SHORT

                Toast.makeText(applicationContext, "Olá, seu nome é $nome", toastLength).show()
            }
        })
    }
}