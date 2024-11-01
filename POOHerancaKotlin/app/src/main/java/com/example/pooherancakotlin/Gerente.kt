package com.example.pooherancakotlin

class Gerente : Funcionario() {

    private var comissao: Double? = null
    private var totalFuncionarios: Int? = 0

    fun getcomissao(): Double{
        return comissao!!
    }

    fun setcomisao(comissao: Double?){
        this.comissao = comissao

    }

    fun gettotalFuncionarios(): Int{
        return totalFuncionarios!!
    }

    fun settotalFuncionarios(totalFuncionarios: Int?){
        this.totalFuncionarios = totalFuncionarios
    }


}