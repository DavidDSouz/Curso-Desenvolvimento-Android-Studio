package com.example.pooherancakotlin

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var txtnomeFuncionario: TextView
    private lateinit var txtsalarioFuncionario: TextView
    private lateinit var txtdataAdmissao: TextView
    private lateinit var txtnomeGerente: TextView
    private lateinit var txtcomissao: TextView
    private lateinit var txttotalFuncionarios: TextView


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


        val joao = Funcionario()

        joao.setnome("joao")
        joao.setsalario(1200)
        joao.setdataAdmissao("01/02/2024")


        val gerentePedro = Gerente()

        gerentePedro.setnome("Pedro")
        gerentePedro.setcomisao(10.5)
        gerentePedro.settotalFuncionarios(25)





            txtnomeFuncionario.text = joao.getnome()
            txtsalarioFuncionario.text = joao.getsalario().toString()
            txtdataAdmissao.text = joao.getdataAdmissao()
            txtnomeGerente.text = gerentePedro.getnome()
            txtcomissao.text = gerentePedro.getcomissao().toString()
            txttotalFuncionarios.text = gerentePedro.gettotalFuncionarios().toString()





        }
    private fun iniciarComponentesDoLayout() {
        txtnomeFuncionario = findViewById(R.id.txtnomeFuncionario)
        txtsalarioFuncionario = findViewById(R.id.txtsalarioFuncionario)
        txtdataAdmissao = findViewById(R.id.txtdataAdmissao)
        txtnomeGerente = findViewById(R.id.txtnomeGerente)
        txtcomissao = findViewById(R.id.txtcomissao)
        txttotalFuncionarios = findViewById(R.id.txttotalFuncionarios)
    }



}