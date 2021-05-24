package conta

import conta.modelo.Cliente
import conta.modelo.ContaCorrente
import conta.modelo.ContaPoupanca
import conta.modelo.totalDeContas
import testaContasDiferentes


fun main() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)

    testaContasDiferentes()

    println("Total de contas: $totalDeContas")

}