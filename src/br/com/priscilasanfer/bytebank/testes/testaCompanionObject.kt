package br.com.priscilasanfer.bytebank.testes

import br.com.priscilasanfer.bytebank.modelo.Cliente
import br.com.priscilasanfer.bytebank.modelo.Conta
import br.com.priscilasanfer.bytebank.modelo.ContaCorrente
import br.com.priscilasanfer.bytebank.modelo.ContaPoupanca

fun testaCompanionObject(){
    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)

    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}