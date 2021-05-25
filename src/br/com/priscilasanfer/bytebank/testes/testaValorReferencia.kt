package br.com.priscilasanfer.bytebank.testes

import br.com.priscilasanfer.bytebank.modelo.Cliente
import br.com.priscilasanfer.bytebank.modelo.ContaPoupanca

fun testaValorReferencia() {
    val meg = Cliente(nome = "Meg", cpf = "456.789.444-45", senha =2)
    val contaMeg = ContaPoupanca(meg, 3)

    var contaMalu = contaMeg
    contaMalu.titular.nome = "Malu"

    println(contaMalu)
    println(contaMeg)
    println("Titula Conta Meg: ${contaMeg.titular}")
    println("Titula Conta Malu: ${contaMalu.titular}")
}