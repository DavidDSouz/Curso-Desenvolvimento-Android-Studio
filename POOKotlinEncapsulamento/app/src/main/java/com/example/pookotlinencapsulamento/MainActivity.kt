package com.example.pookotlinencapsulamento

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var txtTitulo: TextView
    private lateinit var txtautor: TextView
    private lateinit var txteditora: TextView
    private lateinit var txtlocalizacao: TextView
    private lateinit var txtpaginas: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iniciarComponentesDoLayout()
        criarObjetos()
    }

    private fun iniciarComponentesDoLayout() {
        txtTitulo = findViewById(R.id.txtTitulo)
        txtautor = findViewById(R.id.txtautor)
        txteditora = findViewById(R.id.txteditora)
        txtlocalizacao = findViewById(R.id.txtlocalizacao)
        txtpaginas = findViewById(R.id.txtpaginas)
    }

    private fun criarObjetos() {
        val livro = Livro(
            titulo = "Kotlin",
            autor = "Maddo",
            editora = "Mundial POO",
            localizacao = "L1L1",
            paginas = 140
        )

        txtTitulo.text = livro.titulo
        txtautor.text = livro.autor
        txteditora.text = livro.editora
        txtlocalizacao.text = livro.localizacao
        txtpaginas.text = livro.paginas.toString()
    }
}