package br.com.priscilasanfer.bytebank.testes

import conta.modelo.Autenticavel
import conta.modelo.SistemaInterno

fun testaObject() {
    val malu = object : Autenticavel {
        val nome: String = "Malu"
        val cpf: String = "125.658.658-56"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(malu, 1000)
}