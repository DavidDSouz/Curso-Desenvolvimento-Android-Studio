package com.example.pooherancakotlin

open class Funcionario {

    private var nome: String? = null
    private var dataAdmissao: String? = null
    private var salario: Int? = 0

    fun getnome(): String{
        return nome!!
    }

    fun setnome(nome: String?){
        this.nome = nome
    }

    fun getdataAdmissao(): String{
        return dataAdmissao!!
    }

    fun setdataAdmissao(dataAdmissao: String?){
        this.dataAdmissao = dataAdmissao
    }

    fun getsalario(): Int{
        return salario!!
    }

    fun setsalario(salario: Int?){
        this.salario = salario
    }
}