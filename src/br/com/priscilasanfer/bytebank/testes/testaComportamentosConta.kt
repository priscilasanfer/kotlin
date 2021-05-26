package br.com.priscilasanfer.bytebank.testes

import br.com.priscilasanfer.bytebank.exception.FalhaAutenticacaoException
import br.com.priscilasanfer.bytebank.exception.SaldoInsuficienteException
import br.com.priscilasanfer.bytebank.modelo.Cliente
import br.com.priscilasanfer.bytebank.modelo.ContaCorrente
import br.com.priscilasanfer.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val priscila = Cliente(nome = "Priscila", cpf = "123.658.985-45", senha =1)
    val contaPriscila = ContaCorrente(titular = priscila, numero = 1)
    contaPriscila.deposita(-1000.00)
    println("___________________________")
    println("Dados conta Priscila")
    println("Titular: ${contaPriscila.titular}")
    println("Numero da conta: ${contaPriscila.numero}")
    println("Saldo ${contaPriscila.saldo}")

    val malu = Cliente(nome = "Malu", cpf = "456.789.444-45", senha =2)
    val contaMalu = ContaPoupanca(malu, 2)
    contaMalu.deposita(2000.00)
    println("___________________________")
    println("Dados conta Malu")
    println("Titular: ${contaMalu.titular}")
    println("Numero da conta: ${contaMalu.numero}")
    println("Saldo ${contaMalu.saldo}")

    println("___________________________")
    println("Testando deposito conta Priscila ")
    println("Saldo inicial: ${contaPriscila.saldo}")
    contaPriscila.deposita(70.00)
    println("Saldo final: ${contaPriscila.saldo}")

    println("___________________________")
    println("Testando saque conta Priscila")
    println("Saldo inicial: ${contaPriscila.saldo}")
    contaPriscila.saca(10.00)
    println("Saldo final: ${contaPriscila.saldo}")

    println("___________________________")
    println("Testando transferencia  da conta da Priscila para a da Malu")
    println("Saldo inicial Priscila: ${contaPriscila.saldo}")
    println("Saldo inicial Malu: ${contaMalu.saldo}")
    contaPriscila.transfere(50.00, contaMalu, 1)
    println("Saldo final Priscila: ${contaPriscila.saldo}")
    println("Saldo final Malu: ${contaMalu.saldo}")

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)
    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    try {
        contaFran.transfere(destino = contaAlex, valor = 250.0, senha = 2)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException){
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException){
        println("Falha na transferência")
        println("Falha na autenticação")
        e.printStackTrace()
    }
}